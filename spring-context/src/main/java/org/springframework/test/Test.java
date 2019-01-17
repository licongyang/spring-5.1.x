package org.springframework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.UserDao;

/**
 * @TODO:
 * @auther: Duran
 * @date: 2019/1/17 17:56
 * @email: congyang-li@chrtc.com
 * @company: 中国华戎科技集团有限公司
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(UserDao.class);
		annotationConfigApplicationContext.refresh();
		UserDao userDao = (UserDao)annotationConfigApplicationContext.getBean("userDao");

		System.out.println(userDao.query());
	}
}
