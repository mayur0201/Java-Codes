// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class secondHighestNumber {
    public static void main(String[] args) {


        int arr[] = {2,4,1,7,8,8};
        int max = Integer.MIN_VALUE;
        int secondMax =Integer.MIN_VALUE;
        for(int i=0 ; i<=arr.length-1 ; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max= arr[i];
            }
//            else if(arr[i]>secondMax && arr[i] < max)
//            {
//                secondMax = arr[i];
//            }

        }

        System.out.println(secondMax);




    }
}