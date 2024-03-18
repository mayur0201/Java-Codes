public class TwoSums {

    public static void main(String[] args) {

       int[] arr = {1,2,3,5,8};
       int target = 10;
        int[] result = twoSum(arr,target);
        if(result.length ==2)
        {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        else
        {
            System.out.println("No Solution");
        }

    }

    //   Two Pointer Approach
    public static int[] twoSum(int[] nums, int target) {

        int leftpint = 0;
        int rightpoint = nums.length-1;

        while(leftpint <rightpoint)
        {
            if (nums[leftpint] + nums[rightpoint] == target)
            {
                return new int[]{leftpint,rightpoint};
            }
            else if (nums[leftpint] + nums[rightpoint] < target)
            {
                leftpint++ ;
            }
            else {
                rightpoint--;
            }
        }

        return new int[] {};
         }

}
