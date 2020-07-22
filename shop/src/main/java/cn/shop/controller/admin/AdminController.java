package cn.shop.controller.admin;


import cn.shop.entity.Admin;
import cn.shop.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Resource(name = "adminService")
    private AdminServiceImpl adminService;

   @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("/admin/index");
        return modelAndView;
   }
    @GetMapping("/welcome")
    public ModelAndView welcome(){
        ModelAndView modelAndView=new ModelAndView("/admin/welcome");
        return modelAndView;
    }

   //显示管理员列表
   @GetMapping("/adminlist")
    public ModelAndView adminList(){
       ModelAndView modelAndView=new ModelAndView("/admin/adminList");
       modelAndView.addObject("adminList",adminService.getAll());
       return modelAndView;
   }
   @GetMapping("/adminDelete")
   public void adminDelte(int aid){
       adminService.deleteByAid(aid);
   }

   @GetMapping("/adminModify")
    public ModelAndView toAdminModify(int aid){
       ModelAndView modelAndView=new ModelAndView("/admin/adminModify");
       modelAndView.addObject("a",adminService.selectByAid(aid));
       return modelAndView;
   }
   @PostMapping("/adminModify")
    public void adminModify(Admin admin){
       System.out.println("执行了modifyPost");
       adminService.modify(admin);
   }



}
