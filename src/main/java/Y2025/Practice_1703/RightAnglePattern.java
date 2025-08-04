package Y2025.Practice_1703;

public class RightAnglePattern {
    public static void main(String[] args) {
        //right angle pattern means
//        *
//        **
//        ***

        int n=5;

        System.out.println("Right Angle Pattern");
        getRightAnglePattern(n);

        System.out.println("Left Angle Pattern");
        getLeftAnglePattern(n);
    }

    public static void getRightAnglePattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void getLeftAnglePattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //print space
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
