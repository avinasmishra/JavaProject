package SubInterview;

import java.util.TreeSet;

public class Removestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]abb= {"hi","hello","hi"};
TreeSet<String> set=new TreeSet<String> ();
for(int i=0;i<abb.length;i++)
{
	set.add(abb[i]);
	
}
for(String ch:set)
{
	System.out.println(ch);
}
	
	}

}
