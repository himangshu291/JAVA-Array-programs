//Find maximum and minimum elements from list of numbers
import java.io.*;
import java.util.*;
class Maximum
{
    public static void main(String arg[])
    {
        int a[ ]=new int[20];
        int n,i,max,loc;
        System.out.print("Enter the no. of elements:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0; i<n; i++)
        {
            System.out.print("Enter the element:");
            a[i]=s.nextInt();
        }
        max=a[0];
        loc=0;
        for(i=1; i<n; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                loc=i;
            }
        }
        System.out.println("Maximum element: "+max+  " location: "+(loc+1));
    }
}