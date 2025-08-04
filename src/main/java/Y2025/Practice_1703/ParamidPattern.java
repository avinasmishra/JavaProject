package Y2025.Practice_1703;

public class ParamidPattern {
    public static void main(String[] args) {

        int n =5;
        getParamid(n);

    }
    public static void getParamid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //print space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
