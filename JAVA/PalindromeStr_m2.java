import java.util.Scanner;
public class PalindromeStr_m2
{
    public static void main(String args[])
    {
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("The entered string "+str+" is a palindrome");
        }
        else
        {
            System.out.println("The entered string "+str+" is not a palindrome");
        }
    }
}