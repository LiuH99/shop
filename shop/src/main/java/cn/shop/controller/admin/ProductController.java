package cn.shop.controller.admin;


import cn.shop.entity.Product;
import cn.shop.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
    public void productAdd(Product product, HttpServletRequest request, MultipartFile upload) throws Exception {

        String path=request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(path);
        //判断路径是否存在
        if(!file.exists()){
            //如果没有 创建该文件夹
            file.mkdirs();
        }
        //获取上传的图片名称
        String filename=upload.getOriginalFilename();
        //设置随机值
        String uuid=UUID.randomUUID().toString().replace("-","");
        filename=uuid+"-"+filename;
        //完成图片上传
        upload.transferTo(new File(path,filename));
        product.setPpic(filename);
        System.out.println(product.toString());
        //调用add方法
        productService.add(product);

    }

}
