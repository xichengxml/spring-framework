import com.xicheng.demo.common.AppConfig;
import com.xicheng.demo.common.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAppTest {

	static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	public static void main(String[] args) {
		User user = context.getBean("user", User.class);
		System.out.println(user.getName());
	}

}
