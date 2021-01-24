package com.xicheng.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * description 初始化测试类
 *
 * @author xichengxml
 * @date 2021/1/23 上午 08:25
 */
@Component
public class T00_Initialize implements InitializingBean, BeanNameAware, BeanFactoryAware {

	private String beanName;

	private BeanFactory beanFactory;


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
