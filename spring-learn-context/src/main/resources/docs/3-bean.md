#### java bean和spring bean的区别
* spring bean: 被spring生成和管理的对象
* java bean: java对象，属性私有，包含set、get方法

#### java bean生成对象有几种方式
* spring.xml中通过bean标签定义，spring根据定义去生成
* @Component @Service等注解的方式
* @Bean
* BeanDefinition
* FactoryBean
* applicationContext.registerBean(User.class);

大部分框架的用法：编程式用法；声明式用法

spring bean的前三种定义方式是声明式，BeanDefinition是编程式

例如：TransactionManager、@Transactional
