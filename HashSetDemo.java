package Collection_Program;
import java.util.*;
public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(30);
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() );
		}
		  

	}

}
