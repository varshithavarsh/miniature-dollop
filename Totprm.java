import java.util.*;
class Totprm
{
public static void main(String ars[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter minimum range");
int min=sc.nextInt();
System.out.println("Enter maximum range");
int max=sc.nextInt();
int c=0;
for(int i=min;i<=max;i++)
{ 
int x=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
x++;
}}
if(x==0)
c++;
}
System.out.println("Number of prime numbers in a given range is "+c);
}}