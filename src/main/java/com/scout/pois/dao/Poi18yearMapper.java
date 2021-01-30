package com.scout.pois.dao;

import com.scout.pois.entity.Poi18year;
import com.scout.pois.entity.Poi18yearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Poi18yearMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    long countByExample(Poi18yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int deleteByExample(Poi18yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int insert(Poi18year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int insertSelective(Poi18year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    List<Poi18year> selectByExample(Poi18yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    Poi18year selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Poi18year record, @Param("example") Poi18yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Poi18year record, @Param("example") Poi18yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Poi18year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi18year
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Poi18year record);
}