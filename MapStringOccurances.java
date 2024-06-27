package Collection_Program;

import java.util.HashMap;
import java.util.Map;

public class MapStringOccurances {

	public static void main(String[] args) {
		String str="This is a great thing that we are doing now ";
		
		Map<String,Integer> hm=new HashMap<>();
		String[] words=str.split(" ");
		
		for(String word:words) {
			Integer inte=hm.get(word);
			if(inte==null) {
				hm.put(word, 1);
			}
			else {
				hm.put(word,inte+1);
			}
			
		}
		System.out.println(hm);

	}

}
