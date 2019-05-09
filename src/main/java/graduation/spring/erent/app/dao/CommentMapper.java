package graduation.spring.erent.app.dao;

import graduation.spring.erent.app.model.Comment;
import graduation.spring.erent.app.model.response.CommentResponse;
import graduation.spring.erent.app.model.response.ReplyCommentResponse;
import graduation.spring.erent.sys.base.BaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper extends BaseDao<Comment> {

    List<CommentResponse> getCommentById(@Param("talkId") int talkId);
    List<ReplyCommentResponse> getChildCommentsById(@Param("parentId") int parentId);
    int getCommentSizeById(@Param("talkId") int talkId);
}
