package SubInterview;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int count=0;
		if(num<=1)
		{
			System.out.println("not a prime");
			return;
		}
for(int i=1;i<num/2;i++)
{
	if(num%i==0)
	{
		count++;
	}
}
if(count>1)
{
	System.out.println("not a prime");
}else {
	System.out.println("prime");
}
	}

}
