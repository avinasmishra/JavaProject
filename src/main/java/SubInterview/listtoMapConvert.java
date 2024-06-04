package SubInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listtoMapConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<studentdemo>list=new ArrayList<>();
		list.add(new studentdemo(1,"one"));
		list.add(new studentdemo(2,"two"));
		list.add(new studentdemo(3,"three"));
		list.add(new studentdemo(4,"four"));
	list.forEach(item->System.out.println(item));
	Map<Integer,studentdemo>map=new HashMap<>();
	map=list.stream().collect(Collectors.toMap( item->item.getid(),item->item));
map.forEach((k,v)->System.out.println(k+"="+v));
	}

}
class studentdemo{
	int id;
	String name;
	public studentdemo(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public int getid() {
		return id;
		
	}
	public void setid() {
		this.id=id;
		
	}
	public String getname() {
		return name;
		
	}
public void setname(String name) {
	this.name=name;
}
public String toString() {
	
return id+","+name;
}
}

