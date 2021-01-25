import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/1/25 下午 11:10
 */
public class BufferInputStreamTest {

	public static void main(String[] args) {
		byte[] buf = {1, 3, 5, 7, 9};
		ByteArrayInputStream bufferedInputStream = new ByteArrayInputStream(buf);
		System.out.println(bufferedInputStream.read());
		System.out.println(bufferedInputStream.read());
		System.out.println(bufferedInputStream.read());
		System.out.println(bufferedInputStream.read());
		System.out.println(bufferedInputStream.read());

		bufferedInputStream.reset();
		System.out.println(bufferedInputStream.read());

	}
}
