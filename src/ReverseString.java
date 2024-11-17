import java.util.Scanner;

public class ReverseString {

    public static void main(String args[])
    {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter String for Reverse");

        String a = user.nextLine();

       System.out.println("Reverse String is \n" +reverseString(a,"",a.length()-1));
    }

    private static String reverseString(String a, String b, int i) {

        if(i<0)
        {
            return b;
        }
        return  reverseString(a,b+a.charAt(i),i-1);
//        return reverseString(a.substring(1))+ a.charAt(0);
   }
}
