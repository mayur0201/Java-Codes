import java.util.Scanner;

public class Palindrome {

    public static  void main (String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter String for Pallindrome Check");

        String a = user.next();


        if(palindrome(a))
         System.out.println("Pallindrome String");

        else
            System.out.println("Not Pallindrome");
    }

    public static boolean palindrome(String a )
    {
        int l = 0;
        int h = a.length()-1 ;
        boolean flag= true;
        while(l<h)
        {
            if(a.charAt(l) != a.charAt(h))
            {
                flag = false;
            }
            l++;
            h--;
        }
        return flag;
    }

}
