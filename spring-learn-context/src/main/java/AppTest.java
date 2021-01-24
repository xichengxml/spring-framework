import com.xicheng.demo.AppConfig;
import com.xicheng.demo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	public static void main(String[] args) {
		User user = (User) context.getBean("user");
		System.out.println(user.getName());
	}

}
