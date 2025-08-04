package Y2025.Practice_1703;

public class ElementPresentOrNot {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,10,30,40};
        int lookingNumber = 200;
        boolean flag = false;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==lookingNumber)
            {
                flag =true;
                break;
            }
        }
        if(flag) {
            System.out.println("Number Found : " + lookingNumber);
        }
        else
            System.out.println("Number Not Found : " + lookingNumber);
    }
}
