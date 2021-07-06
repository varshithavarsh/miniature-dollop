import java.util.*;
class Endzero
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int x=sc.nextInt();
int[] a=new int[x];
System.out.println("Enter elements");
for(int j=0;j<x;j++)
{
a[j]=sc.nextInt();
}
int s=0;
System.out.println("Enter number");
int n=sc.nextInt();
for(int j=0;j<x;j++)
{
if(a[j]!=n)
{
System.out.print(a[j]+" ");
}
else
s++;
}
for(int k=0;k<s;k++)
{
System.out.print(n+" ");
}
}}
