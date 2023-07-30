import java.io.*;
import java.util.*;
class dec
{
    int arr[]=new int[20];
    int n,i,r;
    Scanner sc=new Scanner(System.in);
    void fn()
    {
        System.out.print("Enter a decimal no.:");
        n=sc.nextInt();
        int t=n;
        i=0;
        while(n>0)
        {
            r=n%2;
            arr[i]=r;
            i++;
            n=n/2;
        }
        System.out.print("Binary Equivalent of "+t+" is:");
        for(i=i-1; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
    }
}
class DecimaltoBinary
{
    public static void main(String args[])
    {
        dec obj=new dec();
        obj.fn();
    }
}