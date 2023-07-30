//WAP to find add all the elements below and above the diagonal elements of a matrix.
import java.io.*;
import java.util.*;
class add
{
    int mat[][]=new int[10][10];
    int i,j,s=0;
    Scanner sc=new Scanner(System.in);
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
        //add elements code
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                if(i!=j)
                    s=s+mat[i][j];
            }
        }
        System.out.println("Sum of the lements below and above the diagonal elements is:"+s);
    }
}
class Add_below_above_diagonal
{
    public static void main(String args[])
    {
        add obj=new add();
        obj.fn();
    }
}
