import java.util.*;
/**  * Demonstrate sorting simple data types.  * Also times how long it takes to sort a million integers.  */
public class SortDemo
{
	public static void main(String[] args) {
		//int size = 10; // initial size 
		int size = 1000000; // size for timing
		Random rand = new Random();
		//int[] data = new int[size]; 
		ArrayList<Integer> data = new ArrayList<Integer>(size);
		
		for (int i = 0; i < size; i++) // fill the array
			//data[i] = rand.nextInt();
			data.add(rand.nextInt());
		
		long start = System.currentTimeMillis();
		
		//Arrays.sort(data); 
		Collections.sort(data);
		
		long end = System.currentTimeMillis();
		//for (int n : data)
		// show the sorted array
		//System.out.println(n);
		
		System.out.println(end - start + " milliseconds");
	}
}
     