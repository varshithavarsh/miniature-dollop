import java.util.*;
class Factorial
{
int fact(int n)
{
if(n==1)
return 1;
else
return (n*fact(n-1));
}
}
class Recursive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
Factorial t= new Factorial();
System.out.println("Factorial of n: "+t.fact(n));
}
}