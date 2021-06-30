import java.util.*;
class Rev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int e=0,o=0;
int r;
while(n!=0)
{
r=n%10;
n=n/10;
if(r%2==0)
e=e*10+r;
else
o=o*10+r;
}
System.out.println(e);
System.out.println(o);
}
}
