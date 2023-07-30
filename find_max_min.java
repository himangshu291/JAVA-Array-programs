//Find minimum and maximum elements from array
import java.io.*;
import java.util.*;
class mn
{
    int arr[]=new int[30];
    int n,i,max,min;
    Scanner sc=new Scanner(System.in);
    void fn()
    {
        System.out.print("Enter no. of elements:");
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            System.out.print("Enter the element:");
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(i=1; i<n; i++)
        {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Maximum="+max);
        System.out.println("Minimum="+min);
    }
}
class find_max_min
{
    public static void main(String args[])
    {
        mn obj=new mn();
        obj.fn();
    }
}