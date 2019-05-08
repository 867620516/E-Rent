package graduation.spring.erent.app.model;

import graduation.spring.erent.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Talk extends BaseModel {
    private String content;
    private int clickRate;
    private int commentCount;
    private Date createTime;
    private Date replyTime;
    private int userID;
    private String userName;
    private String userIcon;
    private boolean del;
}
