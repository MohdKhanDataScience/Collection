package Collection_Program;
import java.util.*;
public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet(List.of(10,50,30,80,10,40,70));
		System.out.println(ts);
		System.out.println(ts.ceiling(60));
		
	}

}
