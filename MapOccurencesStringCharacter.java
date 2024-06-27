package Collection_Program;

import java.util.HashMap;
import java.util.Map;

public class MapOccurencesStringCharacter {

	public static void main(String[] args) {
		String str="This is a great thing";
		Map<Character,Integer> hm=new HashMap<>();
		
		char[] chr=str.toCharArray();
		for(char characters:chr) {
			Integer inte=hm.get(characters);
			
			if(inte==null) {
				hm.put(characters,1);
			}
			else {
				hm.put(characters,inte+1);
			}
		}
		System.out.println(hm);

	}

}
