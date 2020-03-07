package com.javaniuniu.common.service;

import com.javaniuniu.common.annotation.DataScope;
import com.javaniuniu.common.core.domain.Ztree;
import com.javaniuniu.common.domain.SysDept;
import com.javaniuniu.common.mapper.SysDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/7 9:30 PM
 */
@Service
public class SysDeptServiceImpl {
    @Autowired
    private SysDeptMapper deptMapper;

    @DataScope(deptAlias = "d")
    public List<SysDept> selectDeptList(SysDept dept) {
        return deptMapper.selectDeptList(dept);
    }

    @DataScope(deptAlias = "d")
    public List<Ztree> selectDeptTree(SysDept dept) {
        List<SysDept> deptList = deptMapper.selectDeptList(dept);
        List<Ztree> ztrees = new ArrayList<>();
        return ztrees;
    }
}
