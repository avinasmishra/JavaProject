package Y2025.Practice_0405;

public class Sum_Recursion {
    //recursion --> means function call itself
    //1. print 4 to 1 using recursion

    //step1: create one function, than call same function again but before that
    //we have to base case

    static int sumNumber(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n + sumNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
       int result = sumNumber(n);
        System.out.println("Sum Of " + n + " is: "+result);
    }

}
