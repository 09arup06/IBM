
public class Car {
	private String model;
	private String[] features;
	//It can only be the last parameter of the method
	public Car(String model, String...features) {
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features)
			System.out.println(" - " + f);
	}

	public static void main(String[] args) {
		Car alto = new Car("Suzuki Alto","keyless","power window","AC","efficient mileage" );
		alto.specs();
		Car astor = new Car("MG Astor","moon roof","high suspension","keyless","ewindow");
		astor.specs();
	}
}
