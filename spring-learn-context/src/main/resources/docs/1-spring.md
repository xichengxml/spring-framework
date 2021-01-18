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

#### bean生命周期
class -> new 对象 -> 填充属性 -> 放到单例池 -> bean对象

1. 实例化
    1. 实例化前 InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation
    2. 实例化 new对象
    3. 实例化后 InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation

2. 初始化
    1. 初始化前
    2. 初始化 InitializingBean
    3. 初始化后

3.放入单例池

#### bean生命周期源码
1. org.springframework.beans.factory.BeanFactory
2. org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(java.lang.Class<T>)
3. org.springframework.context.ApplicationContext

