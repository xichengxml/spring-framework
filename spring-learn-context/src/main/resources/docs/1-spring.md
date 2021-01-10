#### Spring依赖注入有几种方式
1. 手动注入
    1. set方法
    2. 构造方法
2. 自动注入
    1. xml自动注入
        1. set方法
        2. 构造方法
    2. Autowired
        1. 属性
        2. 构造方法
        3. 普通方法
#### 标签替换
1. &lt;bean/&gt;" -&gt;  @Bean
2. &lt;scope/&gt; -> @Scope
3. &lt;autowire/&gt; -> @Autowired

#### 注入点
添加了Autowired注解的地方
1. 属性
2. 方法

遍历所有的注入点
1. 方法：自动注入，byType -> byName

#### 源码
- [AutowiredAnnotationBeanPostProcessor](org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor)
1. postProcessMergedBeanDefinition
    - InjectionMetadata：类所有注入点的集合
    - InjectedElement： 单个注入点
        - AutowiredFieldElement 属性注入点
        - AutowiredMethodElement 方法注入点
2. postProcessProperties
3. findAutowireCandidates 通过类型找候选者

