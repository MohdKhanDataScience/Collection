package Collection_Program;

import java.util.*;
public class PriorityQue1 
{

	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);
		System.out.println(pq);
		
		System.out.println(pq.peek());
		pq.forEach((x)->System.out.println(x));
		pq.poll();
		System.out.println(pq);
		
		
	}

}
