package com.yiguan.douban;


import com.yiguan.douban.pojo.CommentMusicPojo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DoubanAnalysysApplicationTests {

	@Test
	void contextLoads() {

		CommentMusicPojo commentMusicPojo = new CommentMusicPojo();
		commentMusicPojo.setReviewNum(123);
		commentMusicPojo.setName("test1");
		commentMusicPojo.setIssueDate(new Date());
		commentMusicPojo.setSinger("zzs");
		commentMusicPojo.setStyle("hah");
		Class<? extends CommentMusicPojo> aClass = commentMusicPojo.getClass();
		Field[] declaredFields1 = aClass.getDeclaredFields();
		for (Field declaredField: declaredFields1) {
			declaredField.setAccessible(true);
			try {
				//declaredField.
				System.out.println(declaredField.get(commentMusicPojo).toString());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		System.out.println();
		Class lazz = CommentMusicPojo.class;
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
