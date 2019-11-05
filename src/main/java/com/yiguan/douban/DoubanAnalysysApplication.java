package com.yiguan.douban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.yiguan.douban.mapper")
public class DoubanAnalysysApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoubanAnalysysApplication.class, args);
	}

}
