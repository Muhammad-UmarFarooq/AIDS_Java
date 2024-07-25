import java.io.*;
public class ReverseArray_m1
{
    public static void reverseArray(int[] arr)
    {
        int reversedarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            reversedarr[i]=arr[arr.length-i-1];
        }
        // print reverse array
        System.out.println("Reversed Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(reversedarr[i]);
        }
    }
    public static void main(String args[])
    {
        int originalarr[]={1,2,3,4,5};
        System.out.println("Original Array:");
        for(int i=0;i<originalarr.length;i++)
        {
            System.out.println(originalarr[i]);
        }
        reverseArray(originalarr);
    }
}