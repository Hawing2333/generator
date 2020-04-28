package edu.neu.generator.repository;

import edu.neu.generator.bean.Countrylanguage;
import edu.neu.generator.bean.CountrylanguageExample;
import edu.neu.generator.bean.CountrylanguageKey;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Mapper
public interface CountrylanguageMapper {
    int countByExample(CountrylanguageExample example);

    int deleteByExample(CountrylanguageExample example);

    @Delete({
        "delete from countrylanguage",
        "where CountryCode = #{countrycode,jdbcType=CHAR}",
          "and Language = #{language,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(CountrylanguageKey key);

    @Insert({
        "insert into countrylanguage (CountryCode, Language, ",
        "IsOfficial, Percentage)",
        "values (#{countrycode,jdbcType=CHAR}, #{language,jdbcType=CHAR}, ",
        "#{isofficial,jdbcType=CHAR}, #{percentage,jdbcType=REAL})"
    })
    int insert(Countrylanguage record);

    int insertSelective(Countrylanguage record);

    List<Countrylanguage> selectByExample(CountrylanguageExample example);

    @Select({
        "select",
        "CountryCode, Language, IsOfficial, Percentage",
        "from countrylanguage",
        "where CountryCode = #{countrycode,jdbcType=CHAR}",
          "and Language = #{language,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    int updateByExampleSelective(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    int updateByExample(@Param("record") Countrylanguage record, @Param("example") CountrylanguageExample example);

    int updateByPrimaryKeySelective(Countrylanguage record);

    @Update({
        "update countrylanguage",
        "set IsOfficial = #{isofficial,jdbcType=CHAR},",
          "Percentage = #{percentage,jdbcType=REAL}",
        "where CountryCode = #{countrycode,jdbcType=CHAR}",
          "and Language = #{language,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Countrylanguage record);
}