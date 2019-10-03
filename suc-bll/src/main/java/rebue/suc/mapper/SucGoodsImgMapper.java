package rebue.suc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.robotech.mapper.MybatisBaseMapper;
import rebue.suc.mo.SucGoodsImgMo;

@Mapper
public interface SucGoodsImgMapper extends MybatisBaseMapper<SucGoodsImgMo, Long> {
    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(SucGoodsImgMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(SucGoodsImgMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    SucGoodsImgMo selectByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(SucGoodsImgMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(SucGoodsImgMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucGoodsImgMo> selectAll();

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucGoodsImgMo> selectSelective(SucGoodsImgMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(SucGoodsImgMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(SucGoodsImgMo record);
}