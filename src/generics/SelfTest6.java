package generics;

import java.util.*;

public class SelfTest6 {

	public static void main(String args[]) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("2"); // pq -> 2
		pq.add("4"); // pq -> 2 4
		System.out.println(pq.peek() + " "); //2
		pq.offer("1"); // pq -> 1 2 4
		pq.add("3"); // pq -> 1 2 3 4 
		//pq.remove("1"); // pq -> 2 3 4
		System.out.println(pq.poll() + " "); // 2
		if (pq.remove("2")) // pq -> 3 4
			System.out.print(pq.poll() + " ");
		System.out.println(pq.poll() + " " + pq.peek()); // pq -> 4
		//System.out.println(pq.poll());
		//System.out.println(pq.peek());
	}
}
