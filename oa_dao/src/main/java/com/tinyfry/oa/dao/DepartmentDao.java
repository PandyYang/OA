package com.tinyfry.oa.dao;

import com.tinyfry.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Pandy
 * @Date: 2019/6/9 20:44
 * @Version 1.0
 */
@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
}
