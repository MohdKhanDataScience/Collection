package Collection_Program;
import java.util.*;
public class TreeMapDemo 
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
		
		tm.put(4,"F");
		tm.put(5,"G");
		System.out.println(tm);
		System.out.println(tm.get(3)); 
	}

}
