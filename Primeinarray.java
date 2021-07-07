import java.util.*;
class Primeinarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter elements");
int i,j,temp=0;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=2;j<a[i];j++)
{
if(a[i]%j==0)
  temp++; 
break;
}
}
System.out.println(n-temp);
}
}