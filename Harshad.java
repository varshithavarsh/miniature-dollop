import java.util.*;
class Harshad
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=m;
int r=0;
while(n!=0)
{
r=r+n%10;
n=n/10;
}
if(m%r==0)
System.out.print("Harshad number");
else
System.out.print("Not a Harshad number");
}
}