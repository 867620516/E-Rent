package graduation.spring.erent.app.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CommentRequest {

    private int talkID;
    private int userID;
    private Integer talkOwnerId;
    private Integer parentID;
    private String comment;
    private Integer replierID;
    private String replierName;
    private Date createTime;
}
