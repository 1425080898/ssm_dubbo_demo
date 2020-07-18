package com.lzb.dc.controller;

import com.lzb.common.entity.DeptEntity;
import com.lzb.common.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/select")
    public List<DeptEntity> select(){
        return deptService.select();
    }

}
