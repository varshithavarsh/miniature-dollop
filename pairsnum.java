import java.util.*;
class Test1
{
int prime(int a,int b)
{
int count=0;
int n=0;
for(int i=a;i<=b;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{count=0;
break;}
else
{count=1; }
}
if(count==1)
n++;
}
if(n%2==0)
{
n=n/2;
}
else
{
n=(n+1)/2;
}
return n;
}
}
class pairsnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int a=sc.nextInt();
int b=sc.nextInt();
Test1 t=new Test1();
System.out.println("Number of prime pairs: "+t.prime(a,b));
}
}