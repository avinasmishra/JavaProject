package PracTice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringPrac {
    public static void main(String[] args) {

        //Java String Program to Print Even-Length Words
        //Input: s = "This is a java language"
        String s = "This is a java language";
        String output = "";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            int even = s1[i].length();
            if (even % 2 == 0) {
                output = output + s1[i] + " ";
            }
        }
        System.out.println("Output is:: " + output); // This is java language

        //max array
        int[] arr = {12,13,3,20};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("Max ::"+max);
        System.out.println("Min ::"+min);


    }
}