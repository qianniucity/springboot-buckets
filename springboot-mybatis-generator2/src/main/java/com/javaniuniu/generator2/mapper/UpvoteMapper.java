package com.javaniuniu.generator2.mapper;

import com.javaniuniu.generator2.model.Upvote;
import com.javaniuniu.generator2.model.UpvoteExample;
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

public interface UpvoteMapper {
    @SelectProvider(type=UpvoteSqlProvider.class, method="countByExample")
    int countByExample(UpvoteExample example);

    @DeleteProvider(type=UpvoteSqlProvider.class, method="deleteByExample")
    int deleteByExample(UpvoteExample example);

    @Delete({
        "delete from Upvote",
        "where upvoteID = #{upvoteid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long upvoteid);

    @Insert({
        "insert into Upvote (upvoteID, date, ",
        "fromMemberId, gmt_create, ",
        "gmt_modified, status, ",
        "toMemberId)",
        "values (#{upvoteid,jdbcType=BIGINT}, #{date,jdbcType=VARCHAR}, ",
        "#{frommemberid,jdbcType=VARCHAR}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
        "#{gmtModified,jdbcType=TIMESTAMP}, #{status,jdbcType=INTEGER}, ",
        "#{tomemberid,jdbcType=VARCHAR})"
    })
    int insert(Upvote record);

    @InsertProvider(type=UpvoteSqlProvider.class, method="insertSelective")
    int insertSelective(Upvote record);

    @SelectProvider(type=UpvoteSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="upvoteID", property="upvoteid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="fromMemberId", property="frommemberid", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="toMemberId", property="tomemberid", jdbcType=JdbcType.VARCHAR)
    })
    List<Upvote> selectByExample(UpvoteExample example);

    @Select({
        "select",
        "upvoteID, date, fromMemberId, gmt_create, gmt_modified, status, toMemberId",
        "from Upvote",
        "where upvoteID = #{upvoteid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="upvoteID", property="upvoteid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="fromMemberId", property="frommemberid", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="toMemberId", property="tomemberid", jdbcType=JdbcType.VARCHAR)
    })
    Upvote selectByPrimaryKey(Long upvoteid);

    @UpdateProvider(type=UpvoteSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Upvote record, @Param("example") UpvoteExample example);

    @UpdateProvider(type=UpvoteSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Upvote record, @Param("example") UpvoteExample example);

    @UpdateProvider(type=UpvoteSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Upvote record);

    @Update({
        "update Upvote",
        "set date = #{date,jdbcType=VARCHAR},",
          "fromMemberId = #{frommemberid,jdbcType=VARCHAR},",
          "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},",
          "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "toMemberId = #{tomemberid,jdbcType=VARCHAR}",
        "where upvoteID = #{upvoteid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Upvote record);
}