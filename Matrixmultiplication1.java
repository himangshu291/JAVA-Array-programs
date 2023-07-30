import java.io.*;
import java.util.*;
class Matrix
{
    int mat1[ ][ ]=new int[10][10];
    int mat2[ ][ ]=new int[10][10];
    int mat3[ ][ ]=new int[10][10];
    int m,n,p,q,i,j,k,s;
    Scanner sc=new Scanner(System.in);
    void fn()
    {
        System.out.print("Enter the no. of rows of 1st matrix:");
        m=sc.nextInt();
        System.out.print("Enter the no. of columns of 1st matrix:");
        n=sc.nextInt();
        System.out.println("Enter the elements of 1st matrix:");
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print("Enter "+i+" "+j+" th element: ");
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the no. of rows of 2nd Matrix:");
        p=sc.nextInt();
        System.out.print("Enter the no. of columns of 2nd matrix:");
        q=sc.nextInt();
        System.out.println("Enter the elements of 2nd matrix:");
        for(i=0; i<p; i++)
        {
            for(j=0; j<q; j++)
            {
                System.out.print("Enter "+i+" "+j+" th element: ");
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 1st matrix:");
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(mat1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The 2nd matrix:");
        for(i=0; i<p; i++)
        {
            for(j=0; j<q; j++)
            {
                System.out.print(mat2[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0; i<m; i++)	//Row of mat1
        {
            for(j=0; j<q; j++)	//Col of mat2
            {
                for(k=0; k<n; k++)
                {
                    mat3[i][j]=mat3[i][j]+mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("The Resultant matrix:\n");
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(mat3[i][j]+ " \t");
            }
            System.out.println();
        }
    }
}

class Matrixmultiplication1
{
    public static void main(String args[])
    {
        Matrix obj=new Matrix();
        obj.fn();
    }
}