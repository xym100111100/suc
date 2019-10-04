package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 用户商品分类
 *
 * 数据库表: SUC_GOODS_CLASS
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class SucGoodsClassMo implements Serializable {

    /**
     *    分类ID
     *
     *    数据库字段: SUC_GOODS_CLASS.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    分类名称
     *
     *    数据库字段: SUC_GOODS_CLASS.CLASS_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String className;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    分类ID
     *
     *    数据库字段: SUC_GOODS_CLASS.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    分类ID
     *
     *    数据库字段: SUC_GOODS_CLASS.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    分类名称
     *
     *    数据库字段: SUC_GOODS_CLASS.CLASS_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getClassName() {
        return className;
    }

    /**
     *    分类名称
     *
     *    数据库字段: SUC_GOODS_CLASS.CLASS_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setClassName(String className) {
        this.className = className;
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
        sb.append(", className=").append(className);
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
        SucGoodsClassMo other = (SucGoodsClassMo) that;
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
