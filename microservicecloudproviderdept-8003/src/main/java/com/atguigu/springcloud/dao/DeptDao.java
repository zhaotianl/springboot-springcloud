package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    @Insert("INSERT INTO dept(dname) VALUES(#{dname})")
    public int addDept(Dept dept);

    @Select("select deptno,dname,db_source from dept where deptno=#{deptno}")
    public Dept findById(Long id);

    @Select("select deptno,dname,db_source from dept")
    public List<Dept> findAll();

}
