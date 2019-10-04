package rebue.suc.jo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the SUC_GOODS database table.
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@Entity
@Table(name = "SUC_GOODS")
@Getter
@Setter
@ToString
public class SucGoodsJo implements Serializable {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, length = 19)
    private Long id;

    /**
     * 分类ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "CLASS_ID", nullable = false, length = 19)
    private Long classId;

    /**
     * 商品标题
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "GOOD_TITLE", nullable = false, length = 50)
    private String goodTitle;

    /**
     * 商品详情
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "GOOD_DETAIL", nullable = false, length = 200)
    private String goodDetail;

    /**
     * 上线状态
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "STATE", nullable = false, length = 1)
    private Boolean state;

    /**
     * 商品类型
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "GOOD_TYPE", nullable = false, length = 3)
    private Byte goodType;

    /**
     * 原价
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "OLD_PRICE", nullable = true, length = 10)
    private Integer oldPrice;

    /**
     * 现价
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "NEW_PRICE", nullable = true, length = 10)
    private Integer newPrice;

    /**
     * 购买时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "BUY_TIME", nullable = true, length = 19)
    @Temporal(TemporalType.DATE)
    private Date buyTime;

    /**
     * 属于租借商品时候每天的价格
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "PRICE_DAY", nullable = true, length = 10)
    private Integer priceDay;

    /**
     * 即时出售/租
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "IS_NOW_SELL", nullable = false, length = 1)
    private Boolean isNowSell;

    /**
     * 是否可议价，商品出售的价格或者出租商品每天的价格是否可以商议
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "IS_DISCUSS", nullable = false, length = 1)
    private Boolean isDiscuss;

    /**
     * 用户ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "USER_ID", nullable = false, length = 19)
    private Long userId;

    /**
     * 自动下线时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "AOTU_DOWN_TIME", nullable = false, length = 19)
    @Temporal(TemporalType.DATE)
    private Date aotuDownTime;

    /**
     * 学校名字
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "SCHOOL_NAME", nullable = false, length = 20)
    private String schoolName;

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SucGoodsJo other = (SucGoodsJo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
