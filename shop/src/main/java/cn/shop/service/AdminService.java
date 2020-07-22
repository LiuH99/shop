package cn.shop.service;


import cn.shop.entity.Admin;

import java.util.List;

public interface AdminService {
    //登录
    Admin login(String aname, String apwd);
    //查询所有管理员
    List<Admin> getAll();
    //删除
    void deleteByAid(int aid);
    //根据id查询管理员对象
    Admin selectByAid(int aid);
    //根据id修改管理员对象
    void  modify(Admin admin);
}
