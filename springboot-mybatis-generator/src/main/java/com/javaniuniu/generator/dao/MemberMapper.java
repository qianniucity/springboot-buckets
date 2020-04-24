package com.javaniuniu.generator.dao;

import com.javaniuniu.generator.domain.Member;
import com.javaniuniu.generator.domain.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Long memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectOneByExample(MemberExample example);

    Member selectOneByExampleSelective(@Param("example") MemberExample example, @Param("selective") Member.Column ... selective);

    List<Member> selectByExampleSelective(@Param("example") MemberExample example, @Param("selective") Member.Column ... selective);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKeySelective(@Param("memberid") Long memberid, @Param("selective") Member.Column ... selective);

    Member selectByPrimaryKey(Long memberid);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}