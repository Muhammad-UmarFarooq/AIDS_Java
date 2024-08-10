// Find min and max elements in an array
import java.util.Arrays;
public class Test
{
    public static void main(String args[])
    {
        int arr1[]={5,2,3,8,2,1};
        System.out.println("The array elements are:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        Arrays.sort(arr1);
        System.out.println("\nAfter sorting the array elements are:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nThe min element is "+arr1[0]+" and max element is "+arr1[5]);
    }
}
