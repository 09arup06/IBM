package p3;

public class ShoppingCart extends Product {
	public String Product[] = new String[4];
	public int qty1;
	public String name1;
	public double price1;
	public double total;

	public ShoppingCart() {
	}

	public void addtoCart(String name1, int qty) throws ShopException {
		if (qty < getStock()) {
			total = qty * getPrice();
			this.qty1 = qty;
			checkout(name1, total);
		} else
			throw new ShopException("Sorry we dont have much stock try lower quantity" + getStock()+" ");
			//System.out.println("Sorry we dont have much stock try lower quantity " + getStock() + " ");
	}

	public void checkout(String name1, double total) {
		System.out.println("You have ordered for: " + name1);
		System.out.println("You have ordered for " + qty1 + " pieces");
		System.out.println("The total price is : " + total);
		System.out.println("Click here to checkout");
	}
}
