package SubInterview;

import java.util.TreeSet;

public class Removeintdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]abb= {10,20,30,10,20};
TreeSet<Integer> set=new TreeSet<Integer> ();
for(int i=0;i<abb.length;i++)
{
	set.add(abb[i]);
	
}
for(int ch:set)
{
	System.out.println(ch);
}
	
	}


}

