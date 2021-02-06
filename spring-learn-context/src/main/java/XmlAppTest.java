import com.xicheng.demo.common.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/6 下午 08:13
 */
public class XmlAppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user.getName());
	}
}
