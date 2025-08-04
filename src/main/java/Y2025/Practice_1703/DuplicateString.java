package Y2025.Practice_1703;

public class DuplicateString {
    public static void main(String[] args) {

        String[] words= {"Java","Python","Java","c++","c++","python"};

        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i] == words[j])
                {
                    System.out.println("Duplicate String: "+words[i]);
                }
            }
        }
        
    }
}
