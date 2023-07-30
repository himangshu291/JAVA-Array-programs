import java.io.*;
import java.util.*;
class array_element_Sum
{
    public static void main(String args[])
    {
        int a[ ]=new int[20];
        int n,i,s=0;
        System.out.print("How many no.s:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            System.out.print("Enter the element:");
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        System.out.println("Sum="+s);
    }
}