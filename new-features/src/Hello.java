@FunctionalInterface
public interface Hello {
	String sayHello();

	default String sayBye() {
		return "goodBye";
	}

	static void greet() {
		System.out.println("greeting of the day");
	}

}
