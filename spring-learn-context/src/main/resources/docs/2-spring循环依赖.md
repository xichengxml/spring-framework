#### 循环依赖
java的循环依赖 
```
A a = new A();
B b = new B();

a.b = b;
b.a = a
```

#### Spring的循环依赖
T03_AService和T03_BService

AService的生命周期:
1. 实例化 new对象
2. bService属性填充 -> 去单例池获取 -> 找不到, 实例化
3. 其他属性填充
4. AOP AService代理对象
5. 放入单例池

BService的生命周期:
1. 实例化 new 对象
2. aService属性填充 -> 去单例池获取 -> 找不到，实例化
3. 其他属性填充
4. AOP BService代理对象
5. 放入单例池

在AService填充bService属性的时候，找不到，去实例化BService。在实例化BService的时候，需要填充aService，找不到，去实例化AService。
形成循环依赖

#### 二级缓存

AService生命周期:
1. 实例化 new对象 -> 二级缓存<aService，对象> 
2. bService属性填充 -> 去二级缓存获取 -> 找不到, 实例化

BService生命周期:
1. 实例化 new对象 -> 二级缓存<bService，对象> 
2. aService属性填充 -> 去二级缓存获取

解决了问题，但是缺陷是，二级缓存保存的是原始对象

org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean

#### 解决方案

AOP过程提前
