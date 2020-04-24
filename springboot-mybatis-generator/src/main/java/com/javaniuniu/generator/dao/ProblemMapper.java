package com.javaniuniu.generator.dao;

import com.javaniuniu.generator.domain.Problem;
import com.javaniuniu.generator.domain.ProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper {
    long countByExample(ProblemExample example);

    int deleteByExample(ProblemExample example);

    int deleteByPrimaryKey(Long problemid);

    int insert(Problem record);

    int insertSelective(Problem record);

    Problem selectOneByExample(ProblemExample example);

    Problem selectOneByExampleSelective(@Param("example") ProblemExample example, @Param("selective") Problem.Column ... selective);

    List<Problem> selectByExampleSelective(@Param("example") ProblemExample example, @Param("selective") Problem.Column ... selective);

    List<Problem> selectByExample(ProblemExample example);

    Problem selectByPrimaryKeySelective(@Param("problemid") Long problemid, @Param("selective") Problem.Column ... selective);

    Problem selectByPrimaryKey(Long problemid);

    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);
}