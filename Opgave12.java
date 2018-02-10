import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Opgave12 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("hej");
        list.add("hej");
        list.add("okay");
        list.add("tre");
        list.add("Per");
        list.add("tre");
        list.add("tre");
        contains3(list);

    }

    public static boolean contains3(List<String> a)
    {
        Map<String, Integer> countMap = new TreeMap<>();
        int count = 0;
        int contains3Strings = 3;

        for (int i = 0; i < a.size(); i++)
        {
            String string = a.get(i);
            if(!countMap.containsKey(string)) //hvis map ikke indeholder
             {
                 countMap.put(string,1); // adds the word if it's the first occurence
             }else{
                    // if seen before adds 1 to count
                    countMap.put(string,i+1);
                    count++;
            }
         }

         if (count==contains3Strings) // hvis count er = 3
         {
             System.out.println("True");
             return true;
         }
        System.out.println("False");
         return false;

    }
}
