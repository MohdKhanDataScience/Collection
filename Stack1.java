package Collection_Program;
import java.util.*;
public class Stack1 
{

	public static void main(String[] args)
	{
		Stack<Integer> st=new Stack<>();
		boolean rslt=st.isEmpty();
		System.out.println("The Stack is Empty "+rslt);
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println("Element in Stack "+st);
		rslt=st.isEmpty();
		System.out.println("The Stack is Empty " +rslt);
		int l=st.search(20);
		System.out.println(l);
		
	}

}
