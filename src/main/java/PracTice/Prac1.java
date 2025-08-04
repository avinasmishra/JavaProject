package PracTice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prac1 {
    public static void main(String[] args) {
        int[]arr1 = {20,1,5,1,2,0,3,9};
        Prac1 prac1 = new Prac1();
        prac1.bubbleSort(arr1);
        prac1.countOccurance(arr1);


        String junk = "!@#$ RaMa#12#34";
        System.out.println("Remove All Special char: "+junk.replaceAll("[^A-Za-z0-9]",""));
        System.out.println("Remove All digit: "+junk.replaceAll("[^A-Za-z]",""));
        System.out.println("Only wants digit: "+junk.replaceAll("[^0-9]",""));
        System.out.println("Only wants digit: "+junk.replaceAll("\\D",""));
        System.out.println("Only wants Special char: "+junk.replaceAll("[A-Za-z0-9]",""));
        System.out.println("Only wants value from specific index: "+junk.substring(5,9));
        System.out.println("Only wants value from specific index to end : "+junk.substring(5));

        // // M1 remove the duplicate value from string
        String name = "avinash";
        TreeSet treeSet = new TreeSet<>();
        Set<Character> set = new HashSet();

        for (int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            set.add(ch);
            treeSet.add(ch);
        }
        System.out.println("Using Set: "+set);
        System.out.println("Using TreeSet: "+treeSet);

        // M2. remove the duplicate value from string
        String result = prac1.removeDuplicate(name);
        System.out.println("Using String: "+result);

        //// remove the duplicate value from int[]
        int[] arr = {10,20,10,30};
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for (int i=0;i<arr.length;i++)
        {
            treeSet1.add(arr[i]);
        }
        System.out.println("Using treeset arr: "+treeSet1);

        // remove the duplicate value from string[]
        String[] removeString = {"HI","HELLO","HI","hi"};
        Set<String> set2 = new HashSet<String>();
        for (int i=0;i<removeString.length;i++)
        {
            set2.add(removeString[i]);
        }
        System.out.println("Using treeset arr: "+set2);

        String removeWhiteSpace = "My name is  : Avinash";
        System.out.println(removeWhiteSpace.replaceAll("\\s",""));

        // reverse the given string name
        String rev = "Parvathi";
        String revname ="";
        for(int i=rev.length()-1;i>=0;i--)
        {
            revname = revname+rev.charAt(i);
        }
        System.out.println("Reverse string is: "+revname);

        // reverse the given string word
        String word = "Today is Sunday";
        String newWord ="";
        String[] splitWord = word.split(" ");
        for(int i=splitWord.length-1;i>=0;i--)
        {
            newWord = newWord+splitWord[i] +" ";
        }
        System.out.println("Given string Word: "+word);
        System.out.println("Reverse string Word: "+newWord);

        //count repeated vowels
        String name1 = "Avinash";
        char[] ch = name1.toCharArray();
        int count=0;
        for (int i=0;i< ch.length;i++)
        {
            char vo = ch[i];
            if(vo=='a' || vo=='e' ||vo=='i' ||vo=='o' ||vo=='u')
            {
                count++;
            }
        }
        System.out.println(count);

    }

    public void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int a:arr)
        {
            System.out.print(a +" , ");
        }
        System.out.println("\n");
    }

    //count occurance of digit
    int arr[] = {5,10,5,8,8,8};
    public void countOccurance(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet())
        {
            System.out.println(key +" : "+map.get(key));
        }
    }

    public String removeDuplicate(String str)
    {
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            for (int j=i+1;j<ch.length;j++)
            {
                if (ch[i]==ch[j])
                {
                    ch[j]='0';
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(char sch:ch)
        {
            if(sch != '0')
            {
                sb.append(sch);
            }
        }
        return sb.toString();

    }





}
