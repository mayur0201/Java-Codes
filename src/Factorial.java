import java.util.Scanner;

public class Factorial {

    public static void main(String[] args)

    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter new Number");
        int fact = user.nextInt();
        int result =factorial(fact);

        System.out.print("Result of factorial =" + result);
    }

    private static int factorial(int i) {

        if(i==1 || i ==0)
        {
            return 1;
        }

        return factorial(i-1) * i;
    }
}

