import java.util.*;
class assignm3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter x");
int x=sc.nextInt();
System.out.println("Enter y");
int y=sc.nextInt();
System.out.println("Enter size");
int n=sc.nextInt();
int[] b=new int[n];
int[] a=new int[n];
int r=n-x;
int i;
int m=y+1;
System.out.println("Enter elements");
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
 if((i-m)<0)
 {
 b[n+i-m]=a[i];   
 }
 else
 b[i-m]=a[i];
}
for(i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}}}

