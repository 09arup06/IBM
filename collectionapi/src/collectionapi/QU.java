package collectionapi;

import java.util.LinkedList;
import java.util.Queue;

public class QU{
	public static void main(String[] args) {
		
Queue<String>q1 = new LinkedList<String>();
	q1.add("kolkata");
	q1.add("lol");
	q1.add("pune");
	
	while(!q1.isEmpty())
	{
		System.out.println(q1.poll());
	}
	}
}
