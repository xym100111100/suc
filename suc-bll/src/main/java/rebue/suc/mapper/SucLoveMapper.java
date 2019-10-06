package rebue.suc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import rebue.robotech.mapper.MybatisBaseMapper;
import rebue.suc.mo.SucLoveMo;

@Mapper
public interface SucLoveMapper extends MybatisBaseMapper<SucLoveMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(SucLoveMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(SucLoveMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    SucLoveMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(SucLoveMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(SucLoveMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucLoveMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucLoveMo> selectSelective(SucLoveMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(SucLoveMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(SucLoveMo record);
    
    
    @Delete("delete from SUC_LOVE WHERE GOODS_ID IN (${goodIds}) ")
    int delByIds(@Param("goodIds") String goodIds);
}
