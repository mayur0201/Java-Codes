public class CulpritNumber {

    public static void main(String[] args)
    {
        int[] a  = {1,1,0,1,1,0,1,1,1,0,0,1,1,1};

        System.out.println("Longest trail of 1s " +solution(a));
    }

    private static int solution(int[] a)
    {
        int count = 0 ;
        int maxcount = 0;
        for(int number : a)
        {
            if(number ==1)
            {
                count ++;
                maxcount = Math.max(maxcount, count);
            }
            else
            {
                count = 0;

            }
        }
        return maxcount ;
    }
}
