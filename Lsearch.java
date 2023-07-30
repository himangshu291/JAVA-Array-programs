import java.io.*;
import java.util.*;
class Lsearch
{
    public static void main(String args[])
    {
        int a[ ]=new int[20];
        int n,i,item;
        System.out.print("Enter the no. of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            System.out.print("Enter the element:");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the search item:");
        item=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(a[i]==item)
            {
                System.out.print(item+" found at location "+(i+1));
                break;
            }
        }
        if(i==n)
            System.out.println("Invalid search item");
    }
}