package com.lzb.dp.service;

import com.lzb.dp.dao.DeptDao;
import com.lzb.common.entity.DeptEntity;
import com.lzb.common.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<DeptEntity> select() {
        return deptDao.select();
    }
}
