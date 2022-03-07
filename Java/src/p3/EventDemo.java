package p3;

class EventImpl implements Event {
	public void perform() {
		System.out.println("First perfrormance");
	}
}

public class EventDemo {
	class InnerEventImpl implements Event {
		public void perform() {
			System.out.println("Second perfrormance");
		}
	}

	static class StaticInnerEventImpl implements Event {
		public void perform() {
			System.out.println("Third perfrormance");
		}
	}

	public void anotherEvent() {
		class NestedEventImpl implements Event {
			public void perform() {
				System.out.println("Fourth Performance");
			}
		}
		;
		new NestedEventImpl().perform();
	}

	public void oneMoreEvent() {
		Event e = new Event(){
			public void perform() {
				System.out.println("Fifth performance");
			}
		};
		e.perform();
	}
	public void oneLastEvent() {
		Event e = ()->System.out.println("Sixth performance");
		e.perform();
	}

	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();
		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.perform();
		EventDemo.StaticInnerEventImpl se = new EventDemo.StaticInnerEventImpl();
		se.perform();
		ed.anotherEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
	}
}
