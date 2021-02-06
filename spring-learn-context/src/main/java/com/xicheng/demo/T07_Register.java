package com.xicheng.demo;

import com.xicheng.demo.common.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/6 下午 09:31
 */
public class T07_Register {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.registerBean(User.class);
		applicationContext.refresh();

		User user = applicationContext.getBean(User.class);
		System.out.println(user.getName());
	}
}
