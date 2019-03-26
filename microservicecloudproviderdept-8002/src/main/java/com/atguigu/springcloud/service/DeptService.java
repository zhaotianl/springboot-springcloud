package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;


public interface DeptService {
    public int add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}
