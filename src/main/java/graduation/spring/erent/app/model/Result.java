package graduation.spring.erent.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    //判断结果
    private boolean success;
    //返回信息
    private String message;
}
