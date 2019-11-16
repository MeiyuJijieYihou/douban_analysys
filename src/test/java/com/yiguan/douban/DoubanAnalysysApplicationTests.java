package com.yiguan.douban;


import com.yiguan.douban.pojo.SimpleMusicPojo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DoubanAnalysysApplicationTests {

	@Test
	void contextLoads() {

		SimpleMusicPojo simpleMusicPojo = new SimpleMusicPojo();
		simpleMusicPojo.setReviewNum(123);
		simpleMusicPojo.setName("test1");
		simpleMusicPojo.setIssueDate(new Date());
		simpleMusicPojo.setSinger("zzs");
		simpleMusicPojo.setStyle("hah");
		Class<? extends SimpleMusicPojo> aClass = simpleMusicPojo.getClass();
		Field[] declaredFields1 = aClass.getDeclaredFields();
		for (Field declaredField: declaredFields1) {
			declaredField.setAccessible(true);
			try {
				//declaredField.
				System.out.println(declaredField.get(simpleMusicPojo).toString());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		System.out.println();
		Class lazz = SimpleMusicPojo.class;
		Field[] declaredFields = lazz.getDeclaredFields();
		for (Field declaredField: declaredFields) {
			System.out.println(declaredField.getName());
		}
	}

	@Test
	void datetimeTest() {
		Date nowTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(nowTime));
	}

}
