import java.util.Scanner;
public class LargestOf3_m2
{
    public static void main(String args[])
    {
       int a,b,c,largest,temp;
        //object of scanner class
        Scanner sc=new Scanner(System.in);
        // reading input from the user
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        System.out.println("Enter the third number:");
        c=sc.nextInt();
        // comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
        // comparing the temp variable with c and storing the result in the variable largest
        largest=c>temp?c:temp;
        // comparing in one line
        // largest=c>(a>b?a:b)?c:((a>b)?a:b);
        // prints the largest number
        System.out.println("The largest number is:"+largest);
    }
}