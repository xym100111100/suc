package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 驾校信息
 *
 * 数据库表: SUC_DRIVER_SCHOOL
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class SucDriverSchoolMo implements Serializable {

    /**
     *    驾校ID
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    驾校名字
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String driverName;

    /**
     *    驾校备注(和驾校详情的区别是这里应该是驾校一些重要的信息 比如成长过程，国家单位等)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String driverRemark;

    /**
     *    驾校成立时间
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.FOUND_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date foundTime;

    /**
     *    驾校地址
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ADDRESS
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String address;

    /**
     *    每年学生数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.YEAR_STUDENT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long yearStudent;

    /**
     *    学生学车通过率
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.PASSING_RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Byte passingRate;

    /**
     *    接送详情(比如说接送需要多少钱或者是来到那个地铁口才接送之类)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DELIVER_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String deliverDetail;

    /**
     *    驾校照片
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_IMG
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String driverImg;

    /**
     *    驾校详情(驾校优势之类)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.SCHOOL_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String schoolDetail;

    /**
     *    教练数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TEACHER_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Integer teacherCount;

    /**
     *    训练车数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.CAR_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Integer carCount;

    /**
     *    训练场数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TRAINING_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Integer trainingCount;

    /**
     *    创建时间(相当与入驻平台时间)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.CREAT_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date creatTime;

    /**
     *    综合评分
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ALL_RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long allRate;

    /**
     *    报名费
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.SIGNUP_PRICE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Integer signupPrice;

    /**
     *    全包费
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ALL_PRICE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Integer allPrice;

    /**
     *    训练场面积(单位应该是平方米)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TAINING_AREA
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Integer tainingArea;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    驾校ID
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    驾校ID
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    驾校名字
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     *    驾校名字
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     *    驾校备注(和驾校详情的区别是这里应该是驾校一些重要的信息 比如成长过程，国家单位等)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getDriverRemark() {
        return driverRemark;
    }

    /**
     *    驾校备注(和驾校详情的区别是这里应该是驾校一些重要的信息 比如成长过程，国家单位等)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_REMARK
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDriverRemark(String driverRemark) {
        this.driverRemark = driverRemark;
    }

    /**
     *    驾校成立时间
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.FOUND_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getFoundTime() {
        return foundTime;
    }

    /**
     *    驾校成立时间
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.FOUND_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setFoundTime(Date foundTime) {
        this.foundTime = foundTime;
    }

    /**
     *    驾校地址
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ADDRESS
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getAddress() {
        return address;
    }

    /**
     *    驾校地址
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ADDRESS
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *    每年学生数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.YEAR_STUDENT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getYearStudent() {
        return yearStudent;
    }

    /**
     *    每年学生数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.YEAR_STUDENT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setYearStudent(Long yearStudent) {
        this.yearStudent = yearStudent;
    }

    /**
     *    学生学车通过率
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.PASSING_RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getPassingRate() {
        return passingRate;
    }

    /**
     *    学生学车通过率
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.PASSING_RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPassingRate(Byte passingRate) {
        this.passingRate = passingRate;
    }

    /**
     *    接送详情(比如说接送需要多少钱或者是来到那个地铁口才接送之类)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DELIVER_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getDeliverDetail() {
        return deliverDetail;
    }

    /**
     *    接送详情(比如说接送需要多少钱或者是来到那个地铁口才接送之类)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DELIVER_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDeliverDetail(String deliverDetail) {
        this.deliverDetail = deliverDetail;
    }

    /**
     *    驾校照片
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_IMG
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getDriverImg() {
        return driverImg;
    }

    /**
     *    驾校照片
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.DRIVER_IMG
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDriverImg(String driverImg) {
        this.driverImg = driverImg;
    }

    /**
     *    驾校详情(驾校优势之类)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.SCHOOL_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getSchoolDetail() {
        return schoolDetail;
    }

    /**
     *    驾校详情(驾校优势之类)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.SCHOOL_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSchoolDetail(String schoolDetail) {
        this.schoolDetail = schoolDetail;
    }

    /**
     *    教练数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TEACHER_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Integer getTeacherCount() {
        return teacherCount;
    }

    /**
     *    教练数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TEACHER_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setTeacherCount(Integer teacherCount) {
        this.teacherCount = teacherCount;
    }

    /**
     *    训练车数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.CAR_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Integer getCarCount() {
        return carCount;
    }

    /**
     *    训练车数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.CAR_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setCarCount(Integer carCount) {
        this.carCount = carCount;
    }

    /**
     *    训练场数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TRAINING_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Integer getTrainingCount() {
        return trainingCount;
    }

    /**
     *    训练场数量
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TRAINING_COUNT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setTrainingCount(Integer trainingCount) {
        this.trainingCount = trainingCount;
    }

    /**
     *    创建时间(相当与入驻平台时间)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.CREAT_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     *    创建时间(相当与入驻平台时间)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.CREAT_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     *    综合评分
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ALL_RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getAllRate() {
        return allRate;
    }

    /**
     *    综合评分
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ALL_RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setAllRate(Long allRate) {
        this.allRate = allRate;
    }

    /**
     *    报名费
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.SIGNUP_PRICE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Integer getSignupPrice() {
        return signupPrice;
    }

    /**
     *    报名费
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.SIGNUP_PRICE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSignupPrice(Integer signupPrice) {
        this.signupPrice = signupPrice;
    }

    /**
     *    全包费
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ALL_PRICE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Integer getAllPrice() {
        return allPrice;
    }

    /**
     *    全包费
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.ALL_PRICE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setAllPrice(Integer allPrice) {
        this.allPrice = allPrice;
    }

    /**
     *    训练场面积(单位应该是平方米)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TAINING_AREA
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Integer getTainingArea() {
        return tainingArea;
    }

    /**
     *    训练场面积(单位应该是平方米)
     *
     *    数据库字段: SUC_DRIVER_SCHOOL.TAINING_AREA
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setTainingArea(Integer tainingArea) {
        this.tainingArea = tainingArea;
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
        sb.append(", driverName=").append(driverName);
        sb.append(", driverRemark=").append(driverRemark);
        sb.append(", foundTime=").append(foundTime);
        sb.append(", address=").append(address);
        sb.append(", yearStudent=").append(yearStudent);
        sb.append(", passingRate=").append(passingRate);
        sb.append(", deliverDetail=").append(deliverDetail);
        sb.append(", driverImg=").append(driverImg);
        sb.append(", schoolDetail=").append(schoolDetail);
        sb.append(", teacherCount=").append(teacherCount);
        sb.append(", carCount=").append(carCount);
        sb.append(", trainingCount=").append(trainingCount);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", allRate=").append(allRate);
        sb.append(", signupPrice=").append(signupPrice);
        sb.append(", allPrice=").append(allPrice);
        sb.append(", tainingArea=").append(tainingArea);
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
        SucDriverSchoolMo other = (SucDriverSchoolMo) that;
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
