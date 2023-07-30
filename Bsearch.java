import java.io.*;
import java.util.*;
class Bsearch
{
    public static void main(String args[])
    {
        int beg,end,mid,n,i,item;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in ascending order");
        for(i=0; i<n; i++)
        {
            System.out.print("Enter the element:");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the search element:");
        item=sc.nextInt();
        beg=0;
        end=n-1;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(a[mid]==item)
            {
                System.out.println(item+" found at location "+(mid+1));
                break;
            }
            else if(a[mid]<item)
                beg=mid+1;
            else
                end=mid-1;
        }
        if(beg>end)
            System.out.println("search unsuccesful");
    }
}