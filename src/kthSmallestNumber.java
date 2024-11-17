import java.util.Arrays;

public class kthSmallestNumber {

    public static void main(String[] args) {

//        int[] arr = {0,1,3,5,8};
//        int target = 2;
       int[] A = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
       int B =9;
        int result = smallestNumber(A,B);
       System.out.println("Solution is " + result);

    }

    //   Two Pointer Approach
    public static int smallestNumber(int[] nums, int target) {


        int low = 0;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low < high)
        {
          int mid = low + (high - low)/2;

          if(countNumbers(nums,mid) < target)
          {
              low = mid+1;
          }
          else
          {
              high = mid;
          }
        }

        return low;
    }

    private static int countNumbers(int[] nums, int mid) {

        int count =0;

        for(int a : nums)
        {
            if(a <=mid)
            {
                count++;
            }
        }

        return count;
    }

}
