package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 训练场信息
 *
 * 数据库表: SUC_TAINING_ADDR
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class SucTainingAddrMo implements Serializable {

    /**
     *    训练场ID
     *
     *    数据库字段: SUC_TAINING_ADDR.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    数据库字段: SUC_TAINING_ADDR.DERIVER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long deriverId;

    /**
     *    训练场地址
     *
     *    数据库字段: SUC_TAINING_ADDR.TRAINING_ADDR
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String trainingAddr;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    训练场ID
     *
     *    数据库字段: SUC_TAINING_ADDR.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    训练场ID
     *
     *    数据库字段: SUC_TAINING_ADDR.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    数据库字段: SUC_TAINING_ADDR.DERIVER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getDeriverId() {
        return deriverId;
    }

    /**
     *    数据库字段: SUC_TAINING_ADDR.DERIVER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDeriverId(Long deriverId) {
        this.deriverId = deriverId;
    }

    /**
     *    训练场地址
     *
     *    数据库字段: SUC_TAINING_ADDR.TRAINING_ADDR
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getTrainingAddr() {
        return trainingAddr;
    }

    /**
     *    训练场地址
     *
     *    数据库字段: SUC_TAINING_ADDR.TRAINING_ADDR
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setTrainingAddr(String trainingAddr) {
        this.trainingAddr = trainingAddr;
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deriverId=").append(deriverId);
        sb.append(", trainingAddr=").append(trainingAddr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
        SucTainingAddrMo other = (SucTainingAddrMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}
