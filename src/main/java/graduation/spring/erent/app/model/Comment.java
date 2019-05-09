package graduation.spring.erent.app.model;

import graduation.spring.erent.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends BaseModel {
    private int talkID;
    private int userID;
    private String userName;
    private String userIcon;
    private int parentID;
    private String comment;
    private int replierID;
    private String replierName;
    private Date createTime;
}
