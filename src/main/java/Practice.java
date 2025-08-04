public class Practice {

    public static void main(String[] args) {

        String[] input = {"flows", "flow", "flo"};
        //output : fl

        String prefix = input[0];

        for(int i=1;i<input.length;i++)
        {
         while (!input[i].startsWith(prefix))
         {
             prefix = prefix.substring(0, prefix.length()-1);

         }
        }
        System.out.println("Result :"+prefix);

    }
}