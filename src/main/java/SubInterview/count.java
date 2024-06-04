package SubInterview;



import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
//import java.util.Random;

public class count {

//	private static final String input = null;
//	private static String map;
//	private static CharSequence ch;
//
	//private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mangoa";
		int count = 0;
		 char ch;
		 HashMap<Character,Integer>mp= new HashMap<Character,Integer>();
		 
		for(int i=0;i<name.length();i++)
		{
			ch = name.charAt(i);
			if(mp.containsKey(ch)) {
				count=(int) mp.get(ch);
				count++;
				mp.replace(ch,count);
			}else {
				
				mp.put(ch, 1);
			}
			}
		for(Character key:mp.keySet()) {
			System.out.println(key+"="+mp.get(key));
		}
		}
}

				
