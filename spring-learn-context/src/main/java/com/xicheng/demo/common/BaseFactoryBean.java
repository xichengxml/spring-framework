package com.xicheng.demo.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * description 使用FactoryBean定义Bean
 *
 * @author xichengxml
 * @date 2021/2/6 下午 08:32
 */
@Component
public class BaseFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		return new Person();
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}
}
