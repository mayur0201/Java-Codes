public class PassingCars {

    public static void main (String[] args)
    {
        int[] a  = {0,1,1,1,1};

        System.out.println("Number of passing cars " +solution(a));

    }

    private static int solution(int[] a) {

        int countZeros = 0;
        int passingCars = 0;

        for(int arr : a)
        {
            if(arr==0)
            {
                countZeros++;
            }
            else
            {
                passingCars+= countZeros;

                if (passingCars > 1000000000)
                {
                    return  -1;
                }
            }
        }

        return passingCars;
    }
}
