import java.util.*;

public class lort {
    public static void main(String[] args) {


        /* Write a method contains3 that accepts a list of strings as a parameter
        and returns true if any single string occurs
at least 3 times in the list, and false otherwise. Use a map as auxiliary storage. */

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
        Map<Integer, String> countMap = new TreeMap<>();
        int count = 0;
        int countHigh = 0;
        int contains3Strings = 3;

        for (int i = 0; i < a.size() ; i++) {
            String string = a.get(i);
            if(!countMap.containsValue(a.get(i))) {
                countMap.put(i, string);
            }
        }

        int i = 0;
        int j = 0;

        while(j < a.size())
        {
            if(countMap.containsValue(a.get(i))){


                for (int k = 0; k < a.size() ;) {
                    if(a.get(k) == countMap.get(i))
                    {count++;
                     a.remove(a.get(k));
                     k = 0;
                    }else{
                        k++;
                        if(count >= countHigh){
                        countHigh = count;}

                    }

                }
                count = 0;
            }if(!a.contains(countMap.get(i)))
        {
            j++;
            i++;



        }








        }





        if (countHigh>=contains3Strings) // hvis count er = 3
        {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;

    }
}
