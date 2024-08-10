// Sort array elements in asc and des order
import java.util.Arrays;
import java.util.Collections;
public class Test
{
    public static void main(String args[])
    {
         // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.So,we use wrapper class of int which is Integer
        Integer arr1[]={5,2,3,8,2,1};
        System.out.println("The array elements are:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        Arrays.sort(arr1);
        System.out.println("\nAfter sorting the array elements in ascending order are:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        // We use Collections class method to sort array in desc order
        Arrays.sort(arr1, Collections.reverseOrder());
         System.out.println("\nAfter sorting the array elements in descending order are:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        
    }
}
