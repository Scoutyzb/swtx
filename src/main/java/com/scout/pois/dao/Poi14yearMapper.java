package com.scout.pois.dao;

import com.scout.pois.entity.Poi14year;
import com.scout.pois.entity.Poi14yearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


public interface Poi14yearMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    long countByExample(Poi14yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int deleteByExample(Poi14yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int insert(Poi14year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int insertSelective(Poi14year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    List<Poi14year> selectByExample(Poi14yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    Poi14year selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Poi14year record, @Param("example") Poi14yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Poi14year record, @Param("example") Poi14yearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Poi14year record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poi14year
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Poi14year record);
}