package Collection_Program;
import java.util.*;
public class HashTableDemo
{

	public static void main(String[] args) 
	{
		Hashtable ht=new Hashtable();
		ht.put(1,"A");
		ht.put(2,"B");
		
		String s=(String)ht.get(1);
		System.out.println(s );

	}

}
