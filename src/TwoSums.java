import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 8};
        int target = 6;
        int[] result = twoSum(arr, target);
        if (result.length == 2) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        } else {
            System.out.println("No Solution");
        }

    }


    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<= nums.length-1;i++)
        {
            map.put(nums[i],i);
        }

        for(int i=0;i<= nums.length-1;i++)
        {
            int compliment = target - nums[i];

           if(map.containsKey(compliment) && map.get(compliment) !=i)
            {
                return new int[]{i,map.get(compliment)};
            }
        }

        return new int[]{};
    }


}
