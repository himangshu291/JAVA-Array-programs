//WAP to find sum of all elements of each row of a matrix.
import java.io.*;
import java.util.*;
class add
{
    Scanner sc=new Scanner(System.in);
    int mat[][]=new int[10][10];
    int i,j,sum;
    void fn()
    {
        System.out.print("Enter the no. of rows:");
        int row=sc.nextInt();
        System.out.print("Enter the no. of columns:");
        int col=sc.nextInt();
        System.out.println("Enter Elements for Matrix:\n");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print("Enter "+i+" "+j+" th element:");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        //code to add elements column-wise
        for(i=0; i<row; i++)
        {
            sum=0;
            for(j=0; j<col; j++)
            {
                sum=sum+mat[i][j];
            }
            System.out.println("Sum of the "+i+" row is:"+sum);
        }
    }
}
class Add_Row
{
    public static void main(String args[])
    {
        add obj=new add();
        obj.fn();
    }
}