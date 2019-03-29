package graduation.spring.erent.app.model;

import graduation.spring.erent.sys.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rental extends BaseModel {
    private String itemName;
    private Date arrivalDate;
    private Double rentalPrice;
    private String rentalInterval;//按天按周按月
    private String district;//出租者所在地区
    private int userID;
    private int amount;
    private Double depositPrice;//押金
    private boolean isBrandNew;
    private boolean isBargain;
    private String description;
    private boolean isDeleted;
    private List<String> imageList;
}
