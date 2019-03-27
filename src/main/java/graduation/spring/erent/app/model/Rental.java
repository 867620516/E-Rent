package graduation.spring.erent.app.model;

import graduation.spring.erent.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Rental extends BaseModel {
    private String itemName;
    private Date startDate;
    private Date endDate;
    private Double rentalPrice;
    private Double originalPrice;
    private int userID;
    private int amount;
    private Double depositPrice;
    private boolean isBrandNew;
    private boolean isBargain;
    private String content;
}
