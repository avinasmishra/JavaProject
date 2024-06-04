package SubInterview;

import java.util.TreeSet;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="chanduuu";
		char[] abb=name.toCharArray();
		TreeSet set=new TreeSet();
		for(int i=0;i<name.length();i++)
		{
			set.add(abb[i]);
		}
			
		for(Object ch:set)
		{
			System.out.println(ch);
		}

	}

}
