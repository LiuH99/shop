package cn.nhic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication来标注一个主程序类 说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
