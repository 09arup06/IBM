package collectionapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo3 {
private static void process(int i)
{
	try {
		Thread.sleep(1);
	}catch(InterruptedException e) {}
}
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(1,99).boxed().collect(Collectors.toList());
		long starttime = System.currentTimeMillis();
		numbers.stream().forEach(StreamDemo3::process);
		long endtime=System.currentTimeMillis();
		System.out.println("Time taken by sequential stream: "+(endtime-starttime) );
		
		starttime= System.currentTimeMillis();
		numbers.parallelStream().forEach(StreamDemo3::process);
		endtime=System.currentTimeMillis();
		System.out.println("Time taken by parallel streams: "+(endtime-starttime));
		
	}

}
