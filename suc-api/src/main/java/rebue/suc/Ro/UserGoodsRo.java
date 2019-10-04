package rebue.suc.Ro;

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
public class UserGoodsRo {
	
	private Long id;
	
	private Long classId;
	
	private String className;

	private String goodTitle;

	private String goodDetail;

	private Byte goodType;

	private Integer oldPrice;

	private Integer newPrice;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date buyTime;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date aotuDownTime;

	private Integer priceDay;

	private Boolean isNowSell;

	private Boolean isDiscuss;

	private Long userId;
	
    private Boolean state;

	private List<SucGoodsImgMo> fileList;

}
