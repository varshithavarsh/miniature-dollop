import java.util.*;
public class Noeno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int e=0,o=0;
while(n>0)
{
int i=n%10;
if(i%2==0)
e=e+1;
else
o=o+1;
n=n/10;
}
System.out.println("Number of even numbers"+e);
System.out.println("Number of even numbers"+o);
}
}


