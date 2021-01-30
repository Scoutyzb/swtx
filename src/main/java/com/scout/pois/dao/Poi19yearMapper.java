package com.scout.pois.dao;

import com.scout.pois.entity.Poi19year;
import com.scout.pois.entity.Poi19yearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Poi19yearMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    long countByExample(Poi19yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int deleteByExample(Poi19yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int insert(Poi19year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int insertSelective(Poi19year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    List<Poi19year> selectByExample(Poi19yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    Poi19year selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Poi19year record, @Param("example") Poi19yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Poi19year record, @Param("example") Poi19yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Poi19year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi19year
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Poi19year record);
}