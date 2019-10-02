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
 * The persistent class for the SUC_DRIVER_SCHOOL database table.
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@Entity
@Table(name = "SUC_DRIVER_SCHOOL")
@Getter
@Setter
@ToString
public class SucDriverSchoolJo implements Serializable {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     * 驾校ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, length = 19)
    private Long id;

    /**
     * 驾校名字
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "DRIVER_NAME", nullable = false, length = 50)
    private String driverName;

    /**
     * 驾校备注
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "DRIVER_REMARK", nullable = true, length = 300)
    private String driverRemark;

    /**
     * 驾校成立时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "FOUND_TIME", nullable = false, length = 10)
    @Temporal(TemporalType.DATE)
    private Date foundTime;

    /**
     * 驾校地址
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "ADDRESS", nullable = false, length = 100)
    private String address;

    /**
     * 每年学生数量
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "YEAR_STUDENT", nullable = false, length = 19)
    private Long yearStudent;

    /**
     * 学生学车通过率
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "PASSING_RATE", nullable = false, length = 3)
    private Byte passingRate;

    /**
     * 接送详情
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "DELIVER_DETAIL", nullable = false, length = 200)
    private String deliverDetail;

    /**
     * 驾校照片
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "DRIVER_IMG", nullable = false, length = 200)
    private String driverImg;

    /**
     * 驾校详情
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "SCHOOL_DETAIL", nullable = false, length = 500)
    private String schoolDetail;

    /**
     * 教练数量
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "TEACHER_COUNT", nullable = false, length = 10)
    private Integer teacherCount;

    /**
     * 训练车数量
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "CAR_COUNT", nullable = false, length = 10)
    private Integer carCount;

    /**
     * 训练场数量
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "TRAINING_COUNT", nullable = false, length = 10)
    private Integer trainingCount;

    /**
     * 创建时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "CREAT_TIME", nullable = false, length = 10)
    @Temporal(TemporalType.DATE)
    private Date creatTime;

    /**
     * 综合评分
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "ALL_RATE", nullable = false, length = 10)
    private Long allRate;

    /**
     * 报名费
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "SIGNUP_PRICE", nullable = false, length = 10)
    private Integer signupPrice;

    /**
     * 全包费
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "ALL_PRICE", nullable = false, length = 10)
    private Integer allPrice;

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
        SucDriverSchoolJo other = (SucDriverSchoolJo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
