package com.crx.mapper;

import com.crx.pojo.UserRole;
import com.crx.pojo.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	long countByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int deleteByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int insert(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int insertSelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	List<UserRole> selectByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	UserRole selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int updateByPrimaryKeySelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Tue Jul 30 21:22:56 CST 2019
	 */
	int updateByPrimaryKey(UserRole record);
}