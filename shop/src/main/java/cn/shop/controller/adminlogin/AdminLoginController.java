package cn.shop.controller.adminlogin;


import cn.shop.entity.Admin;
import cn.shop.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/adminlogin")
public class AdminLoginController {

    @Resource(name = "adminService")
    private AdminServiceImpl adminService;

    @GetMapping("/login")
    public ModelAndView tologin(){
        ModelAndView modelAndView=new ModelAndView("/adminlogin/login");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(String aname,String apwd,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Admin admin=adminService.login(aname,apwd);
        if(admin==null){
            System.out.println("登录失败");
            System.out.println();
            modelAndView.setViewName("redirect:/adminlogin/login");
        }else{
            System.out.println("登录成功");
            session.setAttribute("Admin",admin);
            modelAndView.setViewName("redirect:/admin/index");
        }
        return modelAndView;
    }



}
