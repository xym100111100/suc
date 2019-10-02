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
 * The persistent class for the SUC_USER_DRIVER database table.
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@Entity
@Table(name = "SUC_USER_DRIVER")
@Getter
@Setter
@ToString
public class SucUserDriverJo implements Serializable {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户驾校ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, length = 19)
    private Long id;

    /**
     * 驾校ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "DRIVER_ID", nullable = false, length = 19)
    private Long driverId;

    /**
     * 用户ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "USER_ID", nullable = false, length = 19)
    private Long userId;

    /**
     * 状态
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "STATE", nullable = false, length = 3)
    private Byte state;

    /**
     * 驾校训练场ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "TAINING_ID", nullable = false, length = 19)
    private Long tainingId;

    /**
     * 驾校报名时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "SIGNUP_TIME", nullable = false, length = 10)
    @Temporal(TemporalType.DATE)
    private Date signupTime;

    /**
     * 作废时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "CANCEL_TIME", nullable = true, length = 10)
    @Temporal(TemporalType.DATE)
    private Date cancelTime;

    /**
     * 签约时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "SIGNING_TIME", nullable = true, length = 10)
    @Temporal(TemporalType.DATE)
    private Date signingTime;

    /**
     * 完成时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "FINISH_TIME", nullable = true, length = 10)
    @Temporal(TemporalType.DATE)
    private Date finishTime;

    /**
     * 作废原因
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "CANCEL_REASON", nullable = true, length = 10)
    private String cancelReason;

    /**
     * 评论
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "COMMENT", nullable = true, length = 400)
    private String comment;

    /**
     * 评分
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "RATE", nullable = true, length = 10)
    private Long rate;

    /**
     * 推荐人
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "RECOMMENDER", nullable = true, length = 10)
    private String recommender;

    /**
     * 用户名字
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "USER_NAME", nullable = false, length = 10)
    private String userName;

    /**
     * 手机号码
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "MOBILE_PHONE", nullable = true, length = 19)
    private Long mobilePhone;

    /**
     * 合约图片路径
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "CONTRACT_PATH", nullable = true, length = 200)
    private String contractPath;

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
        SucUserDriverJo other = (SucUserDriverJo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
