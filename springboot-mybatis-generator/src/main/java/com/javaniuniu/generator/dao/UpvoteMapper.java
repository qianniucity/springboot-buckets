package com.javaniuniu.generator.dao;

import com.javaniuniu.generator.domain.Upvote;
import com.javaniuniu.generator.domain.UpvoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpvoteMapper {
    long countByExample(UpvoteExample example);

    int deleteByExample(UpvoteExample example);

    int deleteByPrimaryKey(Long upvoteid);

    int insert(Upvote record);

    int insertSelective(Upvote record);

    Upvote selectOneByExample(UpvoteExample example);

    Upvote selectOneByExampleSelective(@Param("example") UpvoteExample example, @Param("selective") Upvote.Column ... selective);

    List<Upvote> selectByExampleSelective(@Param("example") UpvoteExample example, @Param("selective") Upvote.Column ... selective);

    List<Upvote> selectByExample(UpvoteExample example);

    Upvote selectByPrimaryKeySelective(@Param("upvoteid") Long upvoteid, @Param("selective") Upvote.Column ... selective);

    Upvote selectByPrimaryKey(Long upvoteid);

    int updateByExampleSelective(@Param("record") Upvote record, @Param("example") UpvoteExample example);

    int updateByExample(@Param("record") Upvote record, @Param("example") UpvoteExample example);

    int updateByPrimaryKeySelective(Upvote record);

    int updateByPrimaryKey(Upvote record);
}