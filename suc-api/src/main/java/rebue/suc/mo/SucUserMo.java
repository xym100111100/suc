package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
用户表

数据库表: SUC_USER

@mbg.generated 自动生成的注释，如需修改本注释，请删除本行
*/
@JsonInclude(Include.NON_NULL)
public class SucUserMo implements Serializable {
    /**
    用户ID
    
    数据库字段: SUC_USER.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long id;

    /**
    微信昵称(每次登陆都会被修改)
    
    数据库字段: SUC_USER.WX_NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String wxName;

    /**
    微信头像路径(每次登陆都会被修改)
    
    数据库字段: SUC_USER.WX_FACE_PATH
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String wxFacePath;

    /**
    微信openid
    
    数据库字段: SUC_USER.WX_OPENID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String wxOpenid;

    /**
    学校名字
    
    数据库字段: SUC_USER.SCHOOL_NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String schoolName;

    /**
    修改时间戳
    
    数据库字段: SUC_USER.MODIFIED_TIMESTAMP
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long modifiedTimestamp;

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
    用户ID
    
    数据库字段: SUC_USER.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getId() {
        return id;
    }

    /**
    用户ID
    
    数据库字段: SUC_USER.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    微信昵称(每次登陆都会被修改)
    
    数据库字段: SUC_USER.WX_NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getWxName() {
        return wxName;
    }

    /**
    微信昵称(每次登陆都会被修改)
    
    数据库字段: SUC_USER.WX_NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    /**
    微信头像路径(每次登陆都会被修改)
    
    数据库字段: SUC_USER.WX_FACE_PATH
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getWxFacePath() {
        return wxFacePath;
    }

    /**
    微信头像路径(每次登陆都会被修改)
    
    数据库字段: SUC_USER.WX_FACE_PATH
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setWxFacePath(String wxFacePath) {
        this.wxFacePath = wxFacePath;
    }

    /**
    微信openid
    
    数据库字段: SUC_USER.WX_OPENID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
    微信openid
    
    数据库字段: SUC_USER.WX_OPENID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /**
    学校名字
    
    数据库字段: SUC_USER.SCHOOL_NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getSchoolName() {
        return schoolName;
    }

    /**
    学校名字
    
    数据库字段: SUC_USER.SCHOOL_NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
    修改时间戳
    
    数据库字段: SUC_USER.MODIFIED_TIMESTAMP
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    /**
    修改时间戳
    
    数据库字段: SUC_USER.MODIFIED_TIMESTAMP
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setModifiedTimestamp(Long modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
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
        sb.append(", wxName=").append(wxName);
        sb.append(", wxFacePath=").append(wxFacePath);
        sb.append(", wxOpenid=").append(wxOpenid);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", modifiedTimestamp=").append(modifiedTimestamp);
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
        SucUserMo other = (SucUserMo) that;
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