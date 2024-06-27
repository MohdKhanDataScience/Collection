package Collection_Program;
import java.util.*;
public class LinkedHashMapDemo
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer , String> lm=new LinkedHashMap<>(5);
		lm.put(1,"A");
		lm.put(2,"B");
		lm.put(3,"C");
		lm.put(4,"D");
		lm.put(5,"F");
		
		System.out.println(lm );

	}

}
