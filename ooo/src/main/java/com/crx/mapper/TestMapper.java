package com.crx.mapper;

import com.crx.pojo.Test;
import com.crx.pojo.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    long countByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int deleteByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    List<Test> selectByExample(TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    Test selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByPrimaryKey(Test record);
}