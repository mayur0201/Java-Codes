import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddOccuranceinArray {

    public static void main(String[] args) {
    int[] arr = {9,3,9,3,9,7,9};

    List<Integer> lst = solution(arr);

    if(lst.isEmpty())
    {
        System.out.println("No Integer with Odd Occurance");
    } else {

        for (Integer ax : lst) {
            System.out.println(ax);
        }
    }

}

    //    Using HashMap
    private static List<Integer> solution(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int var : arr) {
            Integer count = map.get(var);

            if (count == null) {
                map.put(var, 1);
            } else {
                map.put(var, ++count);
            }
        }


        List<Integer> ls =map.entrySet().stream().filter(x -> (x.getValue() % 2 ==1 )  ).map(Map.Entry::getKey).collect(Collectors.toList());


        return ls;
    }


}
