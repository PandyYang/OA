package com.tinyfry.oa.biz;

import com.tinyfry.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
