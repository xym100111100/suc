package rebue.suc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.robotech.mapper.MybatisBaseMapper;
import rebue.suc.Ro.UserDriverRo;
import rebue.suc.mo.SucGoodsMo;

@Mapper
public interface SucGoodsMapper extends MybatisBaseMapper<SucGoodsMo, Long> {
    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(SucGoodsMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(SucGoodsMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    SucGoodsMo selectByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(SucGoodsMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(SucGoodsMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucGoodsMo> selectAll();

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucGoodsMo> selectSelective(SucGoodsMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(SucGoodsMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(SucGoodsMo record);
    
    
   List<UserDriverRo> listGoods(SucGoodsMo mo);
}