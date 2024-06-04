package SubInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListtoSetConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>ls=new ArrayList<String>();
ls.add("java");
ls.add("Selenium");
ls.add("java");
System.out.println("list value of list" +ls);
Set<String>s1=new HashSet<String>(ls);
System.out.println("this is the value of set" +s1);
	};

}
