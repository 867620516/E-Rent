package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.Comment;
import graduation.spring.erent.app.model.MsgRecordEntity;
import graduation.spring.erent.app.model.request.CommentRequest;
import graduation.spring.erent.app.model.response.CommentResponse;
import graduation.spring.erent.app.service.CommentService;
import graduation.spring.erent.app.service.MsgRecordsService;
import graduation.spring.erent.app.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;
    @Autowired
    TalkService talkService;
    @Autowired
    MsgRecordsService msgRecordsService;

    @RequestMapping("/api/comments")
    public List<CommentResponse> getComments(String talkid){
        return commentService.getCommentByTalkId(Integer.parseInt(talkid));
    }


    @PostMapping("/api/writeComment")
    public String writeComment(@RequestBody CommentRequest commentRequest){
        Comment comment = new Comment();
        comment.setTalkID(commentRequest.getTalkID());
        comment.setComment(commentRequest.getComment());
        comment.setCreateTime(commentRequest.getCreateTime());
        comment.setParentID(commentRequest.getParentID());
        comment.setReplierID(commentRequest.getReplierID());
        comment.setReplierName(commentRequest.getReplierName());
        comment.setUserID(commentRequest.getUserID());
        commentService.save(comment);
        talkService.addCommentCountById(comment.getTalkID());

        /*MsgRecordEntity msgRecordEntity = new MsgRecordEntity();
        msgRecordEntity.setOwnerid(articleCommentRequest.getArticleOwnerId());
        msgRecordEntity.setForm(1);
        msgRecordEntity.setCommentId(articleCommentEntity.getId());
        msgRecordEntity.setReplytime(articleCommentEntity.getCreateTime());
        msgRecordEntity.setIsread(0);
        msgRecordsService.addMsg(msgRecordEntity);
        if(articleCommentRequest.getReplierId() != null){
            MsgRecordEntity commentMsgRecordEntity = new MsgRecordEntity();
            commentMsgRecordEntity.setOwnerid(articleCommentRequest.getReplierId());
            commentMsgRecordEntity.setForm(1);
            commentMsgRecordEntity.setCommentId(articleCommentEntity.getId());
            commentMsgRecordEntity.setReplytime(articleCommentEntity.getCreateTime());
            commentMsgRecordEntity.setIsread(0);
            msgRecordsService.addMsg(commentMsgRecordEntity);
        }
        */
        return "{\"msg\":\"评论成功\",\"edit\":\"修改商品信息成功\"}";
    }
}
