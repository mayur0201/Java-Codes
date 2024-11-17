public class subArrayWithDesiredSum {

    public static void main(String[] args) {

        int[] arr = {2, 1, 0, 5, 8};
        int target = 6;
        result(arr, target);


    }

    private static void result(int[] arr, int target) {

        int currentSum = 0 ;
        int start = 0;

        for(int end = 0 ; end <= arr.length-1 ; end++)
        {
            currentSum += arr[end];

            while (currentSum > target && start < end)
            {
                currentSum-= arr[start];
                start ++;
            }

            if(currentSum == target)
            {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray with the given sum found.");
    }
}
