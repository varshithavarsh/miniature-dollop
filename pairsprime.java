import java.util.*;
class Test2
{
int nene(int s,int e)
{
StringBuffer sb=new StringBuffer();
int count=0;
int i,j;
for(i=s;i<=e;i++)
{
for(j=2;j<i;j++)
{
  if(i%j==0)
  {count=0;
  break; }
  else
  { count=1; }
}
if(count==1)
{
sb.append(i);
}
}
String str=sb.toString();
int num=Integer.parseInt(str);
return num;
}
}
class pairsprime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int s=sc.nextInt();
int e=sc.nextInt();
Test2 t=new Test2();
t.nene(s,e);
int a[]=t.nene(s,e);
int n=a.length();
for(int k=0;k<n;k++)
{ 
System.out.println("("+a[k]+","+a[k+1]);
k++;
}
}
}
