class swap2num_m1
{
    public static void main(String args[])
    {
        int x=10;
        int y=5;
        System.out.println("Before swapping x = "+ x+" and y = "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping x = "+x+" and y = "+y);
    }
}