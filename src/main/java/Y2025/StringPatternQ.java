package Y2025;

public class StringPatternQ {
    public static void main(String[] args) {

        int n=5;

        StringPatternQ stringPatternQ = new StringPatternQ();
        //stringPatternQ.Method1(n);
        System.out.println("-------");
       // stringPatternQ.Method2(n);
        System.out.println("-------");
        //stringPatternQ.Method3(n);
        System.out.println("-------");
        stringPatternQ.Method4(n);
        System.out.println("-------");
        //stringPatternQ.Method5(n);
        System.out.println("-------");
        //stringPatternQ.Method6(n);
        System.out.println("-------");
        //stringPatternQ.Method7(n);
        System.out.println("-------");



    }
    public void Method1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Method2(int n) {
        for (int i = 1; i <= n; i++) {
            //print space
            for(int j=n-i;j>0;j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Method3(int n) {
        for (int i = 1; i <= n; i++) {
            //print space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//Diamond M4
    public void Method4(int n) {
        for (int i = 1; i <= n; i++) {
            //print space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = n; i >0; i--) {
            //print space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public void Method5(int n) {
        for (int i = 1; i <= n; i++) {
            //print space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >0; i--) {
            //print space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void Method6(int n) {
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Method7(int n) {
        for (int i = n; i >=1; i--) {
            //print space
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}