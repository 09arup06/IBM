import java.util.Base64;
import java.util.Base64.Decoder;

public class Test {
	public void test() {
	String password="UEBzc3cwmcQ";
	Decoder decoder= Base64.getDecoder();
	byte[] decoded = decoder.decode(password.getBytes());
	System.out.println(new String(decoded));}
}
