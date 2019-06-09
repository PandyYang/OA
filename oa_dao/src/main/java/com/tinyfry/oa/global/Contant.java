package com.tinyfry.oa.global;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Pandy
 * @Date: 2019/6/9 20:22
 * @Version 1.0
 */
public class Contant {
    //职务
    public static final String POST_STAFF = "员工";
    public static final String POST_FM = "部门经理";
    public static final String POST_GM = "总经理";
    public static final String POST_CASHIER = "财务";

    public List<String> getPosts(){
        List<String> list = new ArrayList<String>();
        list.add(POST_STAFF);
        list.add(POST_CASHIER);
        list.add(POST_FM);
        list.add(POST_GM);
        return list;
    }

    //费用类别
    public List<String> getItems(){
        List<String> list = new ArrayList<String>();
        list.add("交通");
        list.add("餐饮");
        list.add("办公");
        list.add("住宿");
        return list;
    }

    //报销单状态
    public static final String CLAIMVOUCHER_CRREATED = "新创建";
    public static final String CLAIMVOUCHER_SUBMIT = "提交";
    public static final String CLAIMVOUCHER_APPROVED = "审核";
    public static final String CLAIMVOUCHER_BACK = "返回";
    public static final String CLAIMVOUCHER_TERMINATED = "终止";
    public static final String CLAIMVOUCHER_RECHECK = "审核";
    public static final String CLAIMVOUCHER_PAID = "支付";

    //审核额度
    public static final double LIMITED_CHECKED=5000.0;

    //处理方式
    public static final String DEAL_CREATE="创建";
    public static final String DEAL_SUBMIT="提交";
    public static final String DEAL_UPDATE="更新";
    public static final String DEAL_BACK="打回";
    public static final String DEAL_REJECT="拒绝";
    public static final String DEAL_PASS="通过";
    public static final String DEAL_PAID="打款";
}
