import java.util.ArrayList;
import java.util.Optional;

public class findHCF {

    public static void main(String[] args) {

        int a = 36000 , b= 24000;
        int result = findhcf(a, b);

        System.out.println(result);


    }

    private static int findhcf(int a, int b) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i =1 ; i<= a ; i++)
        {
            if (a % i ==0)
            {
                l1.add(i);
            }
        }
        for (int j =1 ; j<= b ; j++)
        {
            if (b % j ==0)
            {
                l2.add(j);
            }
        }

        for(Integer ar : l1)
        {
            if(l2.contains(ar))
            {

                l3.add(ar);
            }
        }

        return l3.stream().max(Integer::compareTo).get();
    }
}
