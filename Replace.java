import java.util.*;
class Replace
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=sc.nextInt();
int y=sc.nextInt();
int r=0,s=0,z=1;
while(n!=0)
{
r=n%10;
if(r==x)
{s=s+y*z;}
else
{s=s+r*z;}
z=z*10;
n=n/10;
}
System.out.print(s);
}
}

