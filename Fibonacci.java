import java.io.*;
import java.util.*;
class Fib
{
	int n,i,a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	void fn()
	{	
		System.out.print("\n Enter the no. of term:");
		n=sc.nextInt();
		System.out.print("\n The fibonacci series is:\n");
		System.out.print(a \n b);
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(c\n);
			a=b;
			b=c;
		}
	}
}
class Fibonacci
{
	public static void main(String args[])
	{
		Fib obj=new Fib();
		obj.fn();
	}
}

		