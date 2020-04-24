package com.javaniuniu.generator.dao;

import com.javaniuniu.generator.domain.Checkdayinfo;
import com.javaniuniu.generator.domain.CheckdayinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckdayinfoMapper {
    long countByExample(CheckdayinfoExample example);

    int deleteByExample(CheckdayinfoExample example);

    int deleteByPrimaryKey(Long infoid);

    int insert(Checkdayinfo record);

    int insertSelective(Checkdayinfo record);

    Checkdayinfo selectOneByExample(CheckdayinfoExample example);

    Checkdayinfo selectOneByExampleSelective(@Param("example") CheckdayinfoExample example, @Param("selective") Checkdayinfo.Column ... selective);

    List<Checkdayinfo> selectByExampleSelective(@Param("example") CheckdayinfoExample example, @Param("selective") Checkdayinfo.Column ... selective);

    List<Checkdayinfo> selectByExample(CheckdayinfoExample example);

    Checkdayinfo selectByPrimaryKeySelective(@Param("infoid") Long infoid, @Param("selective") Checkdayinfo.Column ... selective);

    Checkdayinfo selectByPrimaryKey(Long infoid);

    int updateByExampleSelective(@Param("record") Checkdayinfo record, @Param("example") CheckdayinfoExample example);

    int updateByExample(@Param("record") Checkdayinfo record, @Param("example") CheckdayinfoExample example);

    int updateByPrimaryKeySelective(Checkdayinfo record);

    int updateByPrimaryKey(Checkdayinfo record);
}