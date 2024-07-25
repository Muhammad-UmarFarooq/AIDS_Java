import java.util.Scanner;
public class LargestOf2_m2
{
    public static void main(String args[])
    {
        int num1,num2,largest;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number :");
        num1=sc.nextInt();
        System.out.println("Enter second number:");
        num2=sc.nextInt();
        if(num1>num2)
        largest=num1;
        else
        largest=num2;
        System.out.println("\nLargest ="+largest);
    }
}