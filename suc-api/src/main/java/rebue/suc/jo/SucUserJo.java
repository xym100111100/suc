package rebue.suc.jo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the SUC_USER database table.
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@Entity
@Table(name = "SUC_USER")
@Getter
@Setter
@ToString
public class SucUserJo implements Serializable {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, length = 19)
    private Long id;

    /**
     * 微信昵称
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "WX_NAME", nullable = false, length = 20)
    private String wxName;

    /**
     * 微信头像路径
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "WX_FACE_PATH", nullable = false, length = 200)
    private String wxFacePath;

    /**
     * 微信openid
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "WX_OPENID", nullable = false, length = 200)
    private String wxOpenid;

    /**
     * 学校名字
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "SCHOOL_NAME", nullable = false, length = 50)
    private String schoolName;

    /**
     * 修改时间戳
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "MODIFIED_TIMESTAMP", nullable = false, length = 19)
    private Long modifiedTimestamp;

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
        SucUserJo other = (SucUserJo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
