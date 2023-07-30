import java.io.*;
import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		int a[ ]=new int[20];
		int n,i,item;
		System.out.print("How many no.s:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter search item:");
		int item=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==item)
			{
			System.out.println(item"found at location"+(loc+1));
			break;
			}
		}
		if(i==n)
			System.out.println(item+"not found");
	}
}