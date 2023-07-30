//WAP to find add all the diagonal elements of a 3*3 matrix.
import java.io.*;
import java.util.*;
class add
{
	int mat[][]=new int[3][3];
	int i,j,s=0;
	Scanner sc=new Scanner(System.in);
	void fn()
	{
		System.out.print("\n Enter Elements for Matrix:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		//add diagonal elements code
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i!=j)
				s=s+mat[i][j];
			}
		}
		System.out.print("\n Sum of diagonal elements="+s);
	}
}
class Diagonalelements
{
	public static void main(String args[])
	{
		add obj=new add();
		obj.fn();
	}
}