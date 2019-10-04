package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

/**
 * 商品图片
 *
 * 数据库表: SUC_GOODS_IMG
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class SucGoodsImgMo implements Serializable {

    /**
     *    商品图片ID
     *
     *    数据库字段: SUC_GOODS_IMG.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    商品ID
     *
     *    数据库字段: SUC_GOODS_IMG.GOOD_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long goodId;

    /**
     *    图片路径
     *
     *    数据库字段: SUC_GOODS_IMG.IMG_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String imgPath;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    商品图片ID
     *
     *    数据库字段: SUC_GOODS_IMG.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    商品图片ID
     *
     *    数据库字段: SUC_GOODS_IMG.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    商品ID
     *
     *    数据库字段: SUC_GOODS_IMG.GOOD_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getGoodId() {
        return goodId;
    }

    /**
     *    商品ID
     *
     *    数据库字段: SUC_GOODS_IMG.GOOD_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    /**
     *    图片路径
     *
     *    数据库字段: SUC_GOODS_IMG.IMG_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     *    图片路径
     *
     *    数据库字段: SUC_GOODS_IMG.IMG_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
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
        sb.append(", goodId=").append(goodId);
        sb.append(", imgPath=").append(imgPath);
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
        SucGoodsImgMo other = (SucGoodsImgMo) that;
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
