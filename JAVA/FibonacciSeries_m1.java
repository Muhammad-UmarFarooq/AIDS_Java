
class FibonacciSeries_m1
{
    public static void main(String args[])
    {
        int a=0,b=1,c,count=10;
        // For printing 0 and 1
        System.out.print(a+" "+b);
        for(int i=0;i<count;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    } 
}
