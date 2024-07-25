import java.util.Scanner;
public class BiggestOf2Integers_m2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double num1=0;
        double num2=0;
        System.out.println("Enter num1:");
        num1=sc.nextDouble();
        System.out.println("Enter num2:");
        num2=sc.nextDouble();
        if(num1>num2)
        System.out.println("Largest number is:"+num1);
        else
        System.out.println("Largest number is:"+num2);  
        

    }
}