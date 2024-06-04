package SubInterview;

public class RevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name = "today is sunday";
		String abb[] = name.split(" ");//spilt we need to give space
		for (int i = abb.length - 1; i >= 0; i--) {
			System.out.println(abb[i] + "");
		}
	}

}
