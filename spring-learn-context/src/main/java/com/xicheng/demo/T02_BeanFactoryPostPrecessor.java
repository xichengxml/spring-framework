package com.xicheng.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/1/23 下午 04:17
 */
public class T02_BeanFactoryPostPrecessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
		System.out.println(beanDefinition.getBeanClassName());
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanDefinition;
		genericBeanDefinition.setBeanClassName(User.class.getName());
		genericBeanDefinition.getPropertyValues().add("nickName", "西城xml");
	}
}
