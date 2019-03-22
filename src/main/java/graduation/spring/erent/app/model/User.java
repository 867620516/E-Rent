package graduation.spring.erent.app.model;

import graduation.spring.erent.sys.base.BaseModel;
import lombok.Data;

@Data
public class User extends BaseModel {
    private String userName;
    private String phone;
    private String email;
}
