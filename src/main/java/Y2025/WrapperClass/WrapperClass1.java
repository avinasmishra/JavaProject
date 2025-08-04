package Y2025.WrapperClass;

import java.util.*;

public class WrapperClass1 {
    public static void main(String[] args) {

// Q1: Convert a String to Integer and perform addition

// Input: String num1 = "100", num2 = "200"
// Output: 300
        String num1 = "100" ; String num2 = "200";
        int updatednum1 = Integer.parseInt(num1);
        int updatednum2 = Integer.parseInt(num2);
        int sum = updatednum1 + updatednum2;
        System.out.println("Sum Is: "+sum);
        System.out.println("--------------");

//       Q2. Compare two Integer objects using == and equals()
 Integer x = 127;
 Integer y = 127;
 Integer z = 128;
 Integer w = 128;
        System.out.println("x==y : "+(x==y)); //true
        System.out.println("z==w : "+(z==w));  //false, because Java caches Integer objects in the range -128 to 127.
        //So x and y point to the same object in memory, hence == returns true. (z == w) → false
        System.out.println("x.equals(y) : "+x.equals(y)); //true, because equals() compares values, not references. So 127 == 127 → true
        System.out.println("z.equals(w) : "+z.equals(w)); //true
        System.out.println("--------------");

// Q3: Write a method that takes an array of String numbers and returns the average

 String[] inputs = {"10", "20", "30"};
// Output: 20.0
        int length = inputs.length;
        double result = 0;
        for(String input : inputs)
        {
            double value = Double.parseDouble(input);
            result += value;
        }
        System.out.println("Output:: "+result/length);
        System.out.println("--------------");

//Q4: Write a method to convert a comma-separated String into a list of Integers

// Input: "1,2,3,4,5"
// Output: List<Integer> [1, 2, 3, 4, 5]

    String input = "1,2,3,4,5";
    String[] values = input.split(",");
    List<Integer> outcome =new ArrayList<>();
        for(String value : values)
        {
            outcome.add(Integer.parseInt(value));
        }
        System.out.println("List<Integer>: "+outcome);
        System.out.println("--------------");


    }
}
