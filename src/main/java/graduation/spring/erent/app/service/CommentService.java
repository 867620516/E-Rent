package graduation.spring.erent.app.service;

import graduation.spring.erent.app.dao.CommentMapper;
import graduation.spring.erent.app.model.Comment;
import graduation.spring.erent.app.model.response.CommentResponse;
import graduation.spring.erent.sys.base.BaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService extends BaseService<Comment, CommentMapper> {
    @Autowired
    CommentMapper dao;

    public List<CommentResponse> getCommentByTalkId(int talkId){
        return dao.getCommentById(talkId);
    }
    public int getCommentSizeByTalkId(int talkId){
        return dao.getCommentSizeById(talkId);
    }
}
