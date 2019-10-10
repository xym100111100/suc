package rebue.suc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import rebue.robotech.mapper.MybatisBaseMapper;
import rebue.suc.mo.SucUserMo;

@Mapper
public interface SucUserMapper extends MybatisBaseMapper<SucUserMo, Long> {

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int insert(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int insertSelective(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	SucUserMo selectByPrimaryKey(Long id);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int updateByPrimaryKeySelective(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int updateByPrimaryKeyWithBLOBs(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int updateByPrimaryKey(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	List<SucUserMo> selectAll();

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	List<SucUserMo> selectSelective(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	boolean existByPrimaryKey(Long id);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	boolean existSelective(SucUserMo record);

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	int countSelective(SucUserMo record);

	@Select("select *  from SUC_USER WHERE ID IN (${ids}) ")
	List<SucUserMo> selectByIds(@Param("ids") String ids);
}
