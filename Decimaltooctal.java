import java.io.*;
import java.util.*;
class dec
{
    int arr[]=new int[10];
    int n,i,r;
    Scanner sc=new Scanner(System.in);
    void fn()
    {
        System.out.print("Enter a decimal no.:");
        n=sc.nextInt();
        i=0;
        int t=n;
        while(n>0)
        {
            r=n%8;
            arr[i]=r;
            i=i+1;
            n=n/8;
        }
        System.out.print("Octal Equivalent of "+t+" is:");
        for(i=i-1; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
    }
}
class Decimaltooctal
{
    public static void main(String args[])
    {
        dec obj=new dec();
        obj.fn();
    }
}