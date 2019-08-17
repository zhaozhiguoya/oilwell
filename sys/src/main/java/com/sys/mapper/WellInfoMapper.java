package com.sys.mapper;

import com.sys.pojo.WellInfo;
import com.sys.pojo.WellInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WellInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	long countByExample(WellInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int deleteByExample(WellInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int insert(WellInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int insertSelective(WellInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	List<WellInfo> selectByExample(WellInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	WellInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int updateByExampleSelective(@Param("record") WellInfo record, @Param("example") WellInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int updateByExample(@Param("record") WellInfo record, @Param("example") WellInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int updateByPrimaryKeySelective(WellInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table well_info
	 * @mbg.generated  Wed Aug 14 20:27:46 CST 2019
	 */
	int updateByPrimaryKey(WellInfo record);
}