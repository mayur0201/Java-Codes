import java.util.*;
import java.util.stream.Collectors;

public class DuplicateString {

    public static void main(String[] args) {
        String[] arr = {"aBc", "Axy", "Abc", "Yyy", "axy"};

        List<String> lst = duplicateString(arr);



        if (lst.isEmpty()) {
            System.out.println("No Duplicate String in array");
        } else {
            System.out.println("Duplicate String(s) in an Array :");
            for (String ax : lst) {
                System.out.println(ax);
            }
        }
    }

    //    Using HashMap
    private static List<String> duplicateString(String[] arr) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String var : arr) {
            String key = var.toLowerCase();
            Integer count = map.get(key);



            if (count == null) {
                map.put(key, 1);
            } else {
                map.put(key, ++count);
            }
        }


        List<String> ls
                = map.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());


        return ls;
    }


}
