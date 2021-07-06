import java.util.*;
class Minele
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int ar[]=new int[s];
for(int i=0;i<s;i++)
{
ar[i]=sc.nextInt();
}
int min=ar[0];
for(int i=1;i<s;i++)
{    
if(ar[i]<min)
min=ar[i];
}
System.out.print("minimum element is :"+min);
}}