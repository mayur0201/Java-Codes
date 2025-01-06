import java.util.ArrayList;
import java.util.List;

public class SubArrayWithDesiredSum {

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 5, 8};
        int target = 3;

        List<int[]> result = findAllSubarraysWithSum(arr, target);

        // Print all subarrays
        if (result.isEmpty()) {
            System.out.println("No subarray with the given sum found.");
        } else {
            for (int[] subarray : result) {
                System.out.print("Subarray: ");
                for (int num : subarray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    private static List<int[]> findAllSubarraysWithSum(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink the window if the currentSum exceeds the target
            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // If the current sum equals the target, add the subarray to the result
            if (currentSum == target) {
                int[] subarray = new int[end - start + 1];
                for (int i = 0; i < subarray.length; i++) {
                    subarray[i] = arr[start + i];
                }

                result.add(subarray);
            }
        }

        return result;
    }
}
