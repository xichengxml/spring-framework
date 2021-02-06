package com.xicheng.demo;

import com.xicheng.demo.common.AppConfig;
import com.xicheng.demo.common.BaseFactoryBean;
import com.xicheng.demo.common.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/6 下午 08:33
 */
public class T06_FactoryBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// 生成两个bean对象，&BaseFactoryBean和Person
		// BaseFactoryBean person = applicationContext.getBean("person", BaseFactoryBean.class);
		String[] beanNameForFactoryBean = applicationContext.getBeanNamesForType(BaseFactoryBean.class);
		String[] beanNameForPerson = applicationContext.getBeanNamesForType(Person.class);
		System.out.println(Arrays.toString(beanNameForFactoryBean));
		System.out.println(Arrays.toString(beanNameForPerson));
	}
}
