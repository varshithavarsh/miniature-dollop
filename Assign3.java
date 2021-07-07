import java.util.*;
class Assign3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter k");
int k=sc.nextInt();
System.out.println("Enter size");
int n=sc.nextInt();
int[] b=new int[n];
int[] a=new int[n];
System.out.println("Enter elements");
int i;
int r=n-k;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if((i-r)<0)
{
b[n+i-r]=a[i];
}
else
b[i-r]=a[i];
}
for(i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}}}
