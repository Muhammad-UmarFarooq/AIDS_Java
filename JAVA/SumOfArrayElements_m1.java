import java.util.*;
class SumOfArrayElements_m1
{
    static int sum(int x[],int n)
    {
        if(n<=0)
        return 0;
        return sum(x,n-1)+x[n-1];
    }
    public static void main(String[] args)
    {
     int arr[]={1,5,2,3,4};
     System.out.println("The given array is:");  
     for(int i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]);
     } 
     int s=sum(arr,arr.length);
     System.out.println("The sum of given array is:");
     System.out.println(s);
    }
}