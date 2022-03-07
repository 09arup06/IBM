package p1;

import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.StockSingleton;

public class Main {

	public static void main(String[] args) {
		Holder h=StockSingleton.getStock();
		h.view();
		Broker b=StockSingleton.getStock();
		b.view();
		b.get();
		Exchange e=StockSingleton.getStock();
		e.get();
		e.set();
		e.view();
		System.out.println(h==b);
		System.out.println(b==e);
	}

}
