public class BinaryGap {

    public static void main (String[] args)
    {
        System.out.println("Longest Gap " + solution(9));

    }

    private static int solution(int j) {

        String binaryString  = Integer.toBinaryString(j);
        int maxGap = 0 ;
        int currentGap = 0;


        for (int i = 0; i < binaryString.length(); i++) {

            if(binaryString.charAt(i)=='0')
            {
                currentGap++ ;
                maxGap = Math.max(maxGap,currentGap);
            }

            else
            {
                currentGap = 0;
            }

        }

        return  maxGap;
    }
}
