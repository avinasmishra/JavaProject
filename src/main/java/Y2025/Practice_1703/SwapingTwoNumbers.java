package Y2025.Practice_1703;

public class SwapingTwoNumbers {
    public static void main(String[] args) {

        int a = 12;
        int b =23;
        System.out.println("Before swapping a & b are : "+ a + " " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping a & b are : "+ a + " " + b);

    }
}
