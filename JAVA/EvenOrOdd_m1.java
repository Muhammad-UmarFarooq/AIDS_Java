public class evenorodd_m1
{
    public static void main(String args[])
    {
        int a[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("Odd numbers:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }

        }
        System.out.println("Even numbers:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
