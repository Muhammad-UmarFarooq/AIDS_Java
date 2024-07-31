class MatrixAdd_m1
{
    public static void main(String args[])
    {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        // Creating another matrix to store the sum of two matrix
        int c[][]=new int[3][3];
        // Printing a matrix
        System.out.println("A matrix is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // Printing b matrix
        System.out.println("B matrix is:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        // Adding and printing addition of 2 matrices
        System.out.println("Addition of A and B matrices is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }               
    }
}
