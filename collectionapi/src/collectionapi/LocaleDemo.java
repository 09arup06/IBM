package collectionapi;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		Locale hindi = new Locale("hi");
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", hindi);
		//ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.FRENCH);
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
