import java.util.*;

public class CommonStringFinder {

    public static void main (String[] args)
    {
        String[] a1 = {"Apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
       
        System.out.println("Common Strings " +solution(a1,a2));

    }

    private static List<String> solution(String[] arr, String[] arr1) {

        Set<String> s1 = new HashSet<>();

        for(String a2 : arr)
        {
            s1.add(a2.toLowerCase());
        }

        List<String> ls = new ArrayList<>();

        for(String a : arr1)
        {
           if(s1.contains(a.toLowerCase()))
           {
               ls.add(a);
           }
        }
        return ls;
    }
}
