import java.util.*;
class prefact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int q=sc.nextInt();
int n=50;
int[] p=new int[n+1];
p[0]=1;
for(int i=1;i<n+1;i++)
{
p[i]=p[i-1]*i; 
}
for(int i=0;i<q;i++)
{
int sum=sc.nextInt();
System.out.println(p[sum]); 
}
}
}
