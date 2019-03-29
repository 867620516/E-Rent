package graduation.spring.erent.app.model;

import graduation.spring.erent.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel {
    private String username;
    private String password;
    private String phone;
    private String email;
    private int follower;
    private int following;
    private String icon;
}
