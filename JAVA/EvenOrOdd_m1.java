public class evenorodd_m1
{
    public static void main(String args[])
    {
        int a[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("The given array is:");
        for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
            
        System.out.println("\nOdd numbers:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }

        }
        System.out.print("\nEven numbers:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
