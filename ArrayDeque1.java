package Collection_Program;

import java.util.*;
public class ArrayDeque1
{

	public static void main(String[] args)
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.offerLast(10);
		ad.offerLast(20);
		ad.offerLast(30);
		ad.offerLast(40);
		ad.pollFirst();
		
		System.out.println(ad);
		
		ad.offerFirst(11);
		ad.offerFirst(12);
		ad.offerFirst(13);
		System.out.println(ad);
	}

}
