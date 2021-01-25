import com.xicheng.demo.T04_UserService;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/1/25 下午 10:06
 */
public class ProxyFactoryTest {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		T04_UserService userService = new T04_UserService();
		proxyFactory.setTarget(userService);
		proxyFactory.addAdvice((MethodBeforeAdvice) (method, args1, target) -> {
			System.out.println("before you say something");
		});

		T04_UserService proxy = (T04_UserService) proxyFactory.getProxy();
		proxy.saySomething();
	}
}
