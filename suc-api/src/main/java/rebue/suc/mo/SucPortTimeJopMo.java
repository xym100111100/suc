package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 兼职
 *
 * 数据库表: SUC_PORT_TIME_JOP
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class SucPortTimeJopMo implements Serializable {

    /**
     *    兼职ID
     *
     *    数据库字段: SUC_PORT_TIME_JOP.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    兼职内容
     *
     *    数据库字段: SUC_PORT_TIME_JOP.DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String detail;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    兼职ID
     *
     *    数据库字段: SUC_PORT_TIME_JOP.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    兼职ID
     *
     *    数据库字段: SUC_PORT_TIME_JOP.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    兼职内容
     *
     *    数据库字段: SUC_PORT_TIME_JOP.DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getDetail() {
        return detail;
    }

    /**
     *    兼职内容
     *
     *    数据库字段: SUC_PORT_TIME_JOP.DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDetail(String detail) {
        this.detail = detail;
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
        sb.append(", detail=").append(detail);
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
        SucPortTimeJopMo other = (SucPortTimeJopMo) that;
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
