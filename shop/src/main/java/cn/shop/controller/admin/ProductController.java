package cn.shop.controller.admin;


import cn.shop.entity.Product;
import cn.shop.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/admin")
public class ProductController {

    @Resource(name = "productService")
    private ProductServiceImpl productService;

    //显示所有产品
    @GetMapping("/productList")
    public ModelAndView productList(){

        ModelAndView modelAndView=new ModelAndView("/admin/productList");
        modelAndView.addObject("productList",productService.selectAll());
        return modelAndView;

    }

    @GetMapping("/productAdd")
    public ModelAndView toproductAdd(){
        ModelAndView modelAndView=new ModelAndView("/admin/productAdd");
        return modelAndView;
    }
    //添加产品
    @PostMapping("/productAdd")
    public void productAdd(Product product){
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
