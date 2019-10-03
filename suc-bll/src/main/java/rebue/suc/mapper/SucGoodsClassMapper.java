package rebue.suc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.robotech.mapper.MybatisBaseMapper;
import rebue.suc.mo.SucGoodsClassMo;

@Mapper
public interface SucGoodsClassMapper extends MybatisBaseMapper<SucGoodsClassMo, Long> {
    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(SucGoodsClassMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(SucGoodsClassMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    SucGoodsClassMo selectByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(SucGoodsClassMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(SucGoodsClassMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucGoodsClassMo> selectAll();

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucGoodsClassMo> selectSelective(SucGoodsClassMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(SucGoodsClassMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(SucGoodsClassMo record);
}