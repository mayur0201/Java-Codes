import java.util.HashMap;

public class CountWordsinString {

    public static void main(String[] args) {

        String a = "My Name is Mayur Mangal";
        int result = getcountofwords(a);

        System.out.println(result);


    }

    private static int getcountofwords(String a) {

        HashMap<String,Integer> map = new HashMap<>();

      String[] words = a.split(" ");
      int length = 0 ;
      for(String w : words)
      {
          length++;
      }

      return  length;
    }
}
