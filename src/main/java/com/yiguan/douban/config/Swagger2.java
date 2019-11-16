package com.yiguan.douban.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description：
 * @author: chenfl
 * @Date: 2019/11/16 20:22
 */
@Configuration
@EnableSwagger2
class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yiguan.douban"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("易观-大数据-豆瓣分析")
                .description("基于豆瓣网站内容分析当前热门电影、音乐、书籍的类型和用户偏好。通过该项目学习数据抓取和用户分析。")
                .version("1.0")
                .build();
    }
}