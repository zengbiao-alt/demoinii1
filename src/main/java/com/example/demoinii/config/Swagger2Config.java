//package com.example.demoinii.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//
//@Configuration
//@EnableSwagger2
////可以在项目中进行配置文档的内容
////Dcket:摘要信息，通过对象配置描述文件的信息
////select(),返回的是APi selector Builder对象。通过对象调用build()ke可以创建docker对象
//public class Swagger2Config {
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
//    }
//    private ApiInfo apiInfo(){
//        //定义作者信息
//        Contact contact = new Contact("胖叔","http://www.baidu.com","2481621747@qq.com");
//        //定义接口信息
//        return new ApiInfo(
//                "胖叔的SwaggerAPI文档", //接口标题
//                "文档很详细，注释很清晰，跟我一起开发很愉快", //描述
//                "1.0", //版本
//                "http://www.baidu.com",
//                contact,
//                "Apache 2.0",
//                "http://www.apache.org/licenses/LICENSE-2.0",
//                new ArrayList() //扩展功能引入
//        );
//    }
//
//}
