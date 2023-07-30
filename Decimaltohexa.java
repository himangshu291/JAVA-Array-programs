//WAP to convert a Decimal no. to Hexdecimal no.
import java.io.*;
import java.util.*;
import java.lang.*;
class dec
{
    int n,i,r;
    char ch[]=new char[10];
    Scanner sc=new Scanner(System.in);
    void fn()
    {
        System.out.print("Enter a decimal no.:");
        n=sc.nextInt();
        int t=n;
        i=0;
        while(n>0)
        {
            r=n%16;
            if(r<=9)
                ch[i]=(char)(r+48);			//Ascii of 0 is 48 so add 48 with any no. is a ascii value of that number
            else
                ch[i]=(char)(r+55);			//Ascii of A is 65 so and if 10 comes then add it with 55 so 10+55=65(ascii of A)
            i=i+1;
            n=n/16;
        }
        System.out.print("Hexadecimal Equivalent of "+t+" is:");
        for(i=i-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }
    }
}
class Decimaltohexa
{
    public static void main(String args[])
    {
        dec obj=new dec();
        obj.fn();
    }
}
