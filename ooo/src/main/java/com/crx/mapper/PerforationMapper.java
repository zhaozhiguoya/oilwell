package com.crx.mapper;

import com.crx.pojo.Perforation;
import com.crx.pojo.PerforationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerforationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    long countByExample(PerforationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int deleteByExample(PerforationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int insert(Perforation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int insertSelective(Perforation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    List<Perforation> selectByExample(PerforationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    Perforation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Perforation record, @Param("example") PerforationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByExample(@Param("record") Perforation record, @Param("example") PerforationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByPrimaryKeySelective(Perforation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table perforation
     *
     * @mbg.generated Tue Jul 30 21:22:56 CST 2019
     */
    int updateByPrimaryKey(Perforation record);
}