package rebue.suc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.robotech.mapper.MybatisBaseMapper;
import rebue.suc.mo.SucNoticeMo;

@Mapper
public interface SucNoticeMapper extends MybatisBaseMapper<SucNoticeMo, Long> {
    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(SucNoticeMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(SucNoticeMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    SucNoticeMo selectByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(SucNoticeMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(SucNoticeMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucNoticeMo> selectAll();

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<SucNoticeMo> selectSelective(SucNoticeMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(SucNoticeMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(SucNoticeMo record);
}