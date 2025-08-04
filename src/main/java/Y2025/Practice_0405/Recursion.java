package Y2025.Practice_0405;

public class Recursion {
    //recursion --> means function call itself
    //1. print 4 to 1 using recursion

    //step1: create one function, than call same function again but before that
    //we have to base case

    static void printNumber(int n)
    {
        if(n==1)
        {
            System.out.println("1\n");
            return;
        }
        System.out.print(n+" ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n);
    }

}
