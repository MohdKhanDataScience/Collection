package Collection_Program;
import java.util.*;
public class LinkedList1 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(0, 20);
		l.addFirst(null);
		l.addLast(100);
		
		System.out.println(l);
		
		LinkedList<Integer> l1=new LinkedList<>(List.of(100,200,300));
		System.out.println(l1);
		
		l.remove(3);
		System.out.println(l);
		
	}

}
