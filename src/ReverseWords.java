import java.util.Scanner;

public class ReverseWords {

    public static void main(String args[])
    {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter String for Reverse");

        String a = user.nextLine();

        System.out.println("Reverse Output is  \n" +reverseString(a));
    }

    private static String reverseString(String a) {

        String[] arr = a.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int b = arr.length-1 ; b >=0 ; b--)
        {
            sb.append(new StringBuilder(arr[b]).reverse().toString()).append(" ");
        }

        return sb.toString().trim();
    }
}
