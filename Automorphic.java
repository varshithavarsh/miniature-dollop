import java.util.*;
class Automorphic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int sq,s=0;
sq=x*x;
s=sq%100;
if(s==x)
System.out.print("It is an Automorphic number");
else
System.out.print("It is not an Automorphic number");
}
}