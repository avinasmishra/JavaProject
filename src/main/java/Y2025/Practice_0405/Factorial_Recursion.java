package Y2025.Practice_0405;

public class Factorial_Recursion {
    //recursion --> means function call itself
    //1. print 4 to 1 using recursion

    //step1: create one function, than call same function again but before that
    //we have to base function
    //turn type is always void

    static int factorialNumber(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorialNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int result = factorialNumber(n);
        System.out.println("factorial " +n+ " is: "+result);
    }

}
