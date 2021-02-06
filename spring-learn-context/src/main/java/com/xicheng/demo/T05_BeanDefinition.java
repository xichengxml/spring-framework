package com.xicheng.demo;

import com.xicheng.demo.common.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description 通过BeanDefinition来定义对象
 *
 * @author xichengxml
 * @date 2021/2/6 下午 08:21
 */
public class T05_BeanDefinition {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(User.class);

		applicationContext.registerBeanDefinition("user", beanDefinition);
		applicationContext.refresh();
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user.getName());
	}
}
