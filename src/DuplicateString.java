import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
    
    public static  void main(String[] args)
    {
        String[] arr = {"Abc" , "Axy" , "Abc" , "Yyy"};
       
        System.out.println("Duplicate Value in Array = " + duplicateString(arr));
        
    }

//    Using HashMap
    private static String duplicateString(String[] arr) {

        HashMap<String , Integer> map = new HashMap<>() ;

        for(String var : arr)
        {
            Integer count = map.get(var);

            if (count == null)
            {
                map.put(var,1);
            }
            else
            {
                map.put(var, ++count);
            }
        }

        Set<Map.Entry<String, Integer>> a =map.entrySet();
        for(Map.Entry<String, Integer> x :a)
        {
            if (x.getValue()>1)
            {
                return x.getKey();
            }
        }

        return  null;
    }

//    Using HashSet
//    private static String duplicateString(String[] arr) {
//
//        Set<String> set = new HashSet<>();
//        for(String var:arr)
//        {
//            if(!set.add(var))
//            {
//              return var;
//            }
//
//        }
//        return null;
//    }


}
