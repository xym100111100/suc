package rebue.suc.To;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import rebue.suc.mo.SucGoodsImgMo;


@JsonInclude(Include.NON_NULL)
@Data
public class SucGoodsTo {
	
	private Long id;
	
    private Long classId;
    
    private String goodTitle;
    
    private String goodDetail;
    
    private Byte goodType;
    
    private Integer oldPrice;
    
    private Integer newPrice;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;
    
    private Integer priceDay;
    
    private Boolean isNowSell;
    
    private Boolean isDiscuss;
    
    private Long userId;
    
    private String schoolName;
    
    private List<SucGoodsImgMo>  fileList;
}
