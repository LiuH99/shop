package cn.shop.service.impl;

import cn.shop.dao.AdminDao;
import cn.shop.entity.Admin;
import cn.shop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Resource(name = "adminDao")
    private AdminDao adminDao;

    @Override
    public Admin login(String aname, String apwd) {
        //根据账号查询管理员
        Admin admin=adminDao.selectByAname(aname);
        if(admin==null){
            return null;
        }else if (admin.getApwd().equals(apwd)){
            return admin;
        }else {
            return null;
        }
    }

    //获取管理员列表
    @Override
    public List<Admin> getAll() {
        return adminDao.selectAll();
    }

    //根据id删除管理员
    @Override
    public void deleteByAid(int aid) {
        adminDao.deleteByAid(aid);
    }

    @Override
    public Admin selectByAid(int aid) {
        return adminDao.selectByAid(aid);
    }

    @Override
    public void modify(Admin admin) {
        adminDao.modify(admin);
    }
}
