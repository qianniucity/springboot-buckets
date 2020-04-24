package com.javaniuniu.generator2.mapper;

import com.javaniuniu.generator2.model.Problem;
import com.javaniuniu.generator2.model.ProblemExample;
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

public interface ProblemMapper {
    @SelectProvider(type=ProblemSqlProvider.class, method="countByExample")
    int countByExample(ProblemExample example);

    @DeleteProvider(type=ProblemSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProblemExample example);

    @Delete({
        "delete from Problem",
        "where problemID = #{problemid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long problemid);

    @Insert({
        "insert into Problem (problemID, cnUrl, ",
        "date, enUrl, indexNum, ",
        "name, questionTitleSlug)",
        "values (#{problemid,jdbcType=BIGINT}, #{cnurl,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=VARCHAR}, #{enurl,jdbcType=VARCHAR}, #{indexnum,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{questiontitleslug,jdbcType=VARCHAR})"
    })
    int insert(Problem record);

    @InsertProvider(type=ProblemSqlProvider.class, method="insertSelective")
    int insertSelective(Problem record);

    @SelectProvider(type=ProblemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="problemID", property="problemid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="cnUrl", property="cnurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="enUrl", property="enurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="indexNum", property="indexnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionTitleSlug", property="questiontitleslug", jdbcType=JdbcType.VARCHAR)
    })
    List<Problem> selectByExample(ProblemExample example);

    @Select({
        "select",
        "problemID, cnUrl, date, enUrl, indexNum, name, questionTitleSlug",
        "from Problem",
        "where problemID = #{problemid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="problemID", property="problemid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="cnUrl", property="cnurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="enUrl", property="enurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="indexNum", property="indexnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="questionTitleSlug", property="questiontitleslug", jdbcType=JdbcType.VARCHAR)
    })
    Problem selectByPrimaryKey(Long problemid);

    @UpdateProvider(type=ProblemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    @UpdateProvider(type=ProblemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    @UpdateProvider(type=ProblemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Problem record);

    @Update({
        "update Problem",
        "set cnUrl = #{cnurl,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=VARCHAR},",
          "enUrl = #{enurl,jdbcType=VARCHAR},",
          "indexNum = #{indexnum,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "questionTitleSlug = #{questiontitleslug,jdbcType=VARCHAR}",
        "where problemID = #{problemid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Problem record);
}