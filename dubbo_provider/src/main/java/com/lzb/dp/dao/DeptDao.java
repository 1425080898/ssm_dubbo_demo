package com.lzb.dp.dao;

import com.lzb.common.entity.DeptEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptDao {
    List<DeptEntity> select();
}
