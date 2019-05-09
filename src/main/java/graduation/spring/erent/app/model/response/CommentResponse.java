package graduation.spring.erent.app.model.response;

import graduation.spring.erent.app.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CommentResponse extends Comment {


    private Integer childCommentsCount;

    private List<ReplyCommentResponse> childComments;

    /*private String userName;

    private String userIcon;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userHeadImg) {
        this.userIcon = userHeadImg;
    }*/

    public Integer getChildCommentsCount() {
        return childCommentsCount;
    }

    public void setChildCommentsCount(Integer childCommentsCount) {
        this.childCommentsCount = childCommentsCount;
    }

    public List<ReplyCommentResponse> getChildComments() {
        return childComments;
    }

    public void setChildComments(List<ReplyCommentResponse> childComments) {
        this.childComments = childComments;
        this.childCommentsCount = childComments.size();
    }
}
