import java.util.Scanner;
public class PrintAscii_ex3_m2
{
    public static void main(String args[])
    {
        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);
        char chr=sc.next().charAt(0);
        int ascii=chr;
        System.out.println("The ASCII value of "+chr+" is: "+ascii);
    }
}
