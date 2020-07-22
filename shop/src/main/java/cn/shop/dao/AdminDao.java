package cn.shop.dao;

import cn.shop.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminDao")
public interface AdminDao {

    //管理员登录
    Admin selectByAname(String aname);
    //显示所有管理员
    List<Admin> selectAll();
    //根据id删除
    void deleteByAid(int aid);
    //根据id查询管理员对象
    Admin selectByAid(int aid);
    //根据id修改管理员对象
    void  modify(Admin admin);
}
