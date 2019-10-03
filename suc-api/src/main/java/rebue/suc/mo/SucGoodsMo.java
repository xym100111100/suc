package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**

数据库表: SUC_GOODS

@mbg.generated 自动生成的注释，如需修改本注释，请删除本行
*/
@JsonInclude(Include.NON_NULL)
public class SucGoodsMo implements Serializable {
    /**
    商品ID
    
    数据库字段: SUC_GOODS.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long id;

    /**
    分类ID
    
    数据库字段: SUC_GOODS.CLASS_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long classId;

    /**
    商品标题
    
    数据库字段: SUC_GOODS.GOOD_TITLE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String goodTitle;

    /**
    商品详情
    
    数据库字段: SUC_GOODS.GOOD_DETAIL
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String goodDetail;

    /**
    上线状态 
    
    数据库字段: SUC_GOODS.STATE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Boolean state;

    /**
    商品类型 1:出售 2：出租
    
    数据库字段: SUC_GOODS.GOOD_TYPE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Byte goodType;

    /**
    原价
    
    数据库字段: SUC_GOODS.OLD_PRICE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Integer oldPrice;

    /**
    现价
    
    数据库字段: SUC_GOODS.NEW_PRICE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Integer newPrice;

    /**
    购买时间
    
    数据库字段: SUC_GOODS.BUY_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date buyTime;

    /**
    属于租借商品时候每天的价格
    
    数据库字段: SUC_GOODS.PRICE_DAY
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Integer priceDay;

    /**
    即时出售/租
    
    数据库字段: SUC_GOODS.IS_NOW_SELL
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Boolean isNowSell;

    /**
    是否可议价，商品出售的价格或者出租商品每天的价格是否可以商议
    
    数据库字段: SUC_GOODS.IS_DISCUSS
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Boolean isDiscuss;

    /**
    用户ID
    
    数据库字段: SUC_GOODS.USER_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long userId;

    /**
    自动下线时间
    
    数据库字段: SUC_GOODS.AOTU_DOWN_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date aotuDownTime;

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
    商品ID
    
    数据库字段: SUC_GOODS.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getId() {
        return id;
    }

    /**
    商品ID
    
    数据库字段: SUC_GOODS.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    分类ID
    
    数据库字段: SUC_GOODS.CLASS_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getClassId() {
        return classId;
    }

    /**
    分类ID
    
    数据库字段: SUC_GOODS.CLASS_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
    商品标题
    
    数据库字段: SUC_GOODS.GOOD_TITLE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getGoodTitle() {
        return goodTitle;
    }

    /**
    商品标题
    
    数据库字段: SUC_GOODS.GOOD_TITLE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setGoodTitle(String goodTitle) {
        this.goodTitle = goodTitle;
    }

    /**
    商品详情
    
    数据库字段: SUC_GOODS.GOOD_DETAIL
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getGoodDetail() {
        return goodDetail;
    }

    /**
    商品详情
    
    数据库字段: SUC_GOODS.GOOD_DETAIL
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setGoodDetail(String goodDetail) {
        this.goodDetail = goodDetail;
    }

    /**
    上线状态 
    
    数据库字段: SUC_GOODS.STATE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Boolean getState() {
        return state;
    }

    /**
    上线状态 
    
    数据库字段: SUC_GOODS.STATE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
    商品类型 1:出售 2：出租
    
    数据库字段: SUC_GOODS.GOOD_TYPE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Byte getGoodType() {
        return goodType;
    }

    /**
    商品类型 1:出售 2：出租
    
    数据库字段: SUC_GOODS.GOOD_TYPE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setGoodType(Byte goodType) {
        this.goodType = goodType;
    }

    /**
    原价
    
    数据库字段: SUC_GOODS.OLD_PRICE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Integer getOldPrice() {
        return oldPrice;
    }

    /**
    原价
    
    数据库字段: SUC_GOODS.OLD_PRICE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    /**
    现价
    
    数据库字段: SUC_GOODS.NEW_PRICE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Integer getNewPrice() {
        return newPrice;
    }

    /**
    现价
    
    数据库字段: SUC_GOODS.NEW_PRICE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setNewPrice(Integer newPrice) {
        this.newPrice = newPrice;
    }

    /**
    购买时间
    
    数据库字段: SUC_GOODS.BUY_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
    购买时间
    
    数据库字段: SUC_GOODS.BUY_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    /**
    属于租借商品时候每天的价格
    
    数据库字段: SUC_GOODS.PRICE_DAY
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Integer getPriceDay() {
        return priceDay;
    }

    /**
    属于租借商品时候每天的价格
    
    数据库字段: SUC_GOODS.PRICE_DAY
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setPriceDay(Integer priceDay) {
        this.priceDay = priceDay;
    }

    /**
    即时出售/租
    
    数据库字段: SUC_GOODS.IS_NOW_SELL
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Boolean getIsNowSell() {
        return isNowSell;
    }

    /**
    即时出售/租
    
    数据库字段: SUC_GOODS.IS_NOW_SELL
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setIsNowSell(Boolean isNowSell) {
        this.isNowSell = isNowSell;
    }

    /**
    是否可议价，商品出售的价格或者出租商品每天的价格是否可以商议
    
    数据库字段: SUC_GOODS.IS_DISCUSS
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Boolean getIsDiscuss() {
        return isDiscuss;
    }

    /**
    是否可议价，商品出售的价格或者出租商品每天的价格是否可以商议
    
    数据库字段: SUC_GOODS.IS_DISCUSS
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setIsDiscuss(Boolean isDiscuss) {
        this.isDiscuss = isDiscuss;
    }

    /**
    用户ID
    
    数据库字段: SUC_GOODS.USER_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getUserId() {
        return userId;
    }

    /**
    用户ID
    
    数据库字段: SUC_GOODS.USER_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
    自动下线时间
    
    数据库字段: SUC_GOODS.AOTU_DOWN_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Date getAotuDownTime() {
        return aotuDownTime;
    }

    /**
    自动下线时间
    
    数据库字段: SUC_GOODS.AOTU_DOWN_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setAotuDownTime(Date aotuDownTime) {
        this.aotuDownTime = aotuDownTime;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classId=").append(classId);
        sb.append(", goodTitle=").append(goodTitle);
        sb.append(", goodDetail=").append(goodDetail);
        sb.append(", state=").append(state);
        sb.append(", goodType=").append(goodType);
        sb.append(", oldPrice=").append(oldPrice);
        sb.append(", newPrice=").append(newPrice);
        sb.append(", buyTime=").append(buyTime);
        sb.append(", priceDay=").append(priceDay);
        sb.append(", isNowSell=").append(isNowSell);
        sb.append(", isDiscuss=").append(isDiscuss);
        sb.append(", userId=").append(userId);
        sb.append(", aotuDownTime=").append(aotuDownTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SucGoodsMo other = (SucGoodsMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}