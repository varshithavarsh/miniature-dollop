import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int i,j,temp=0;
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n/2-1;i++)
{
for(j=n-1;j>=n/2;j--)
{
if(a[i]==a[j])
temp=1;
else
break;
}
}
if(temp==1)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}