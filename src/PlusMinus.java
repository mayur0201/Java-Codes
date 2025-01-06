import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, -1, -8};

        System.out.println(getpercentage(arr));


    }

    private static List<Float> getpercentage(int[] arr) {

        int positive = 0, negative = 0, zero = 0, total = arr.length;
        float positive_percentage = 0, negative_percenatge = 0, zero_percentage = 0;
        List<Float> ls = new ArrayList<>();

        for (int i = 0; i <= total - 1; i++) {
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] > 0) {
                positive++;

            } else if (arr[i] == 0) {
                zero++;
            }
        }
        positive_percentage = (float) positive / total;
        negative_percenatge = (float) negative / total;
        zero_percentage = (float) zero / total;


        return Arrays.asList(positive_percentage, negative_percenatge, zero_percentage);


    }
}
