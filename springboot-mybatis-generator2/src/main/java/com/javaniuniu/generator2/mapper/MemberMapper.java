package com.javaniuniu.generator2.mapper;

import com.javaniuniu.generator2.model.Member;
import com.javaniuniu.generator2.model.MemberExample;
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

public interface MemberMapper {
    @SelectProvider(type=MemberSqlProvider.class, method="countByExample")
    int countByExample(MemberExample example);

    @DeleteProvider(type=MemberSqlProvider.class, method="deleteByExample")
    int deleteByExample(MemberExample example);

    @Delete({
        "delete from Member",
        "where memberId = #{memberid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long memberid);

    @Insert({
        "insert into Member (memberId, acceptanceRate, ",
        "acceptedSubmission, address, ",
        "avatar, cnUrl, date, ",
        "enUrl, gmt_create, ",
        "gmt_modified, platform, ",
        "solvedQuestion, status, ",
        "submissionCount, totalChecked, ",
        "username, website)",
        "values (#{memberid,jdbcType=BIGINT}, #{acceptancerate,jdbcType=DOUBLE}, ",
        "#{acceptedsubmission,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{avatar,jdbcType=VARCHAR}, #{cnurl,jdbcType=VARCHAR}, #{date,jdbcType=VARCHAR}, ",
        "#{enurl,jdbcType=VARCHAR}, #{gmtCreate,jdbcType=VARCHAR}, ",
        "#{gmtModified,jdbcType=VARCHAR}, #{platform,jdbcType=VARCHAR}, ",
        "#{solvedquestion,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
        "#{submissioncount,jdbcType=INTEGER}, #{totalchecked,jdbcType=INTEGER}, ",
        "#{username,jdbcType=VARCHAR}, #{website,jdbcType=VARCHAR})"
    })
    int insert(Member record);

    @InsertProvider(type=MemberSqlProvider.class, method="insertSelective")
    int insertSelective(Member record);

    @SelectProvider(type=MemberSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="memberId", property="memberid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="acceptanceRate", property="acceptancerate", jdbcType=JdbcType.DOUBLE),
        @Result(column="acceptedSubmission", property="acceptedsubmission", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="cnUrl", property="cnurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="enUrl", property="enurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="solvedQuestion", property="solvedquestion", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="submissionCount", property="submissioncount", jdbcType=JdbcType.INTEGER),
        @Result(column="totalChecked", property="totalchecked", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="website", property="website", jdbcType=JdbcType.VARCHAR)
    })
    List<Member> selectByExample(MemberExample example);

    @Select({
        "select",
        "memberId, acceptanceRate, acceptedSubmission, address, avatar, cnUrl, date, ",
        "enUrl, gmt_create, gmt_modified, platform, solvedQuestion, status, submissionCount, ",
        "totalChecked, username, website",
        "from Member",
        "where memberId = #{memberid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="memberId", property="memberid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="acceptanceRate", property="acceptancerate", jdbcType=JdbcType.DOUBLE),
        @Result(column="acceptedSubmission", property="acceptedsubmission", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="cnUrl", property="cnurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="enUrl", property="enurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="solvedQuestion", property="solvedquestion", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="submissionCount", property="submissioncount", jdbcType=JdbcType.INTEGER),
        @Result(column="totalChecked", property="totalchecked", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="website", property="website", jdbcType=JdbcType.VARCHAR)
    })
    Member selectByPrimaryKey(Long memberid);

    @UpdateProvider(type=MemberSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    @UpdateProvider(type=MemberSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    @UpdateProvider(type=MemberSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Member record);

    @Update({
        "update Member",
        "set acceptanceRate = #{acceptancerate,jdbcType=DOUBLE},",
          "acceptedSubmission = #{acceptedsubmission,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "cnUrl = #{cnurl,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=VARCHAR},",
          "enUrl = #{enurl,jdbcType=VARCHAR},",
          "gmt_create = #{gmtCreate,jdbcType=VARCHAR},",
          "gmt_modified = #{gmtModified,jdbcType=VARCHAR},",
          "platform = #{platform,jdbcType=VARCHAR},",
          "solvedQuestion = #{solvedquestion,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "submissionCount = #{submissioncount,jdbcType=INTEGER},",
          "totalChecked = #{totalchecked,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR},",
          "website = #{website,jdbcType=VARCHAR}",
        "where memberId = #{memberid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Member record);
}