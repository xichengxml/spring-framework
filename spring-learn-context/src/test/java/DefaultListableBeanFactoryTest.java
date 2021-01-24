import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/1/23 上午 09:03
 */
public class DefaultListableBeanFactoryTest {

	public static void main(String[] args) {
		Field[] declaredFields = DefaultListableBeanFactory.class.getDeclaredFields();
		System.out.println("DefaultListableBeanFactoryTest getFieldTest: " + Arrays.toString(declaredFields));
	}

}
