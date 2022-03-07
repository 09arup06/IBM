
public class ChildDemo<Z, S>extends Demo<Z> {
	private S temp;
	public ChildDemo(Z data, S temp) {
		super(data);
		this.temp=temp;
	}
	public S getTemp() {
		return temp;
	}

	public void setTemp(S temp) {
		this.temp=temp;
	}
	public static void main(String[] args) {
		ChildDemo<String , Integer> c1 = new ChildDemo<String, Integer>("oplo",21);
		System.out.println(c1.getData()+"\t"+c1.getTemp());
	}
}
