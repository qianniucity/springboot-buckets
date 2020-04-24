package com.javaniuniu.generator2.mapper;

import com.javaniuniu.generator2.model.Checkdayinfo;
import com.javaniuniu.generator2.model.CheckdayinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CheckdayinfoMapper {
    @SelectProvider(type=CheckdayinfoSqlProvider.class, method="countByExample")
    int countByExample(CheckdayinfoExample example);

    @DeleteProvider(type=CheckdayinfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(CheckdayinfoExample example);

    @Delete({
        "delete from CheckDayInfo",
        "where infoId = #{infoid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long infoid);

    @Insert({
        "insert into CheckDayInfo (infoId, checkDaysInTheLastYear, ",
        "checked, checkedTime, ",
        "date, solvedProblemNumberOfToday, ",
        "submissionOfToday, updateTime, ",
        "upvoteNumber, username)",
        "values (#{infoid,jdbcType=BIGINT}, #{checkdaysinthelastyear,jdbcType=INTEGER}, ",
        "#{checked,jdbcType=INTEGER}, #{checkedtime,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=VARCHAR}, #{solvedproblemnumberoftoday,jdbcType=INTEGER}, ",
        "#{submissionoftoday,jdbcType=INTEGER}, #{updatetime,jdbcType=VARCHAR}, ",
        "#{upvotenumber,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR})"
    })
    int insert(Checkdayinfo record);

    @InsertProvider(type=CheckdayinfoSqlProvider.class, method="insertSelective")
    int insertSelective(Checkdayinfo record);

    @SelectProvider(type=CheckdayinfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="infoId", property="infoid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="checkDaysInTheLastYear", property="checkdaysinthelastyear", jdbcType=JdbcType.INTEGER),
        @Result(column="checked", property="checked", jdbcType=JdbcType.INTEGER),
        @Result(column="checkedTime", property="checkedtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="solvedProblemNumberOfToday", property="solvedproblemnumberoftoday", jdbcType=JdbcType.INTEGER),
        @Result(column="submissionOfToday", property="submissionoftoday", jdbcType=JdbcType.INTEGER),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="upvoteNumber", property="upvotenumber", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    List<Checkdayinfo> selectByExample(CheckdayinfoExample example);

    @Select({
        "select",
        "infoId, checkDaysInTheLastYear, checked, checkedTime, date, solvedProblemNumberOfToday, ",
        "submissionOfToday, updateTime, upvoteNumber, username",
        "from CheckDayInfo",
        "where infoId = #{infoid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="infoId", property="infoid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="checkDaysInTheLastYear", property="checkdaysinthelastyear", jdbcType=JdbcType.INTEGER),
        @Result(column="checked", property="checked", jdbcType=JdbcType.INTEGER),
        @Result(column="checkedTime", property="checkedtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="solvedProblemNumberOfToday", property="solvedproblemnumberoftoday", jdbcType=JdbcType.INTEGER),
        @Result(column="submissionOfToday", property="submissionoftoday", jdbcType=JdbcType.INTEGER),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="upvoteNumber", property="upvotenumber", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR)
    })
    Checkdayinfo selectByPrimaryKey(Long infoid);

    @UpdateProvider(type=CheckdayinfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Checkdayinfo record, @Param("example") CheckdayinfoExample example);

    @UpdateProvider(type=CheckdayinfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Checkdayinfo record, @Param("example") CheckdayinfoExample example);

    @UpdateProvider(type=CheckdayinfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Checkdayinfo record);

    @Update({
        "update CheckDayInfo",
        "set checkDaysInTheLastYear = #{checkdaysinthelastyear,jdbcType=INTEGER},",
          "checked = #{checked,jdbcType=INTEGER},",
          "checkedTime = #{checkedtime,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=VARCHAR},",
          "solvedProblemNumberOfToday = #{solvedproblemnumberoftoday,jdbcType=INTEGER},",
          "submissionOfToday = #{submissionoftoday,jdbcType=INTEGER},",
          "updateTime = #{updatetime,jdbcType=VARCHAR},",
          "upvoteNumber = #{upvotenumber,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR}",
        "where infoId = #{infoid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Checkdayinfo record);
}