import java.util.*;
class Assign1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Size");
int n=sc.nextInt();
int i;
int a[]=new int[n];
System.out.println("Elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int e=0,o=0,s=1;
for(i=0;i<n;i++)
{
    if(a[i]%2==0)
     {e++;}
    else
      { o++;  }
}
s=o*e;
if(s%2==0)
{  System.out.println("Even"); }
else
{ System.out.println("Odd");  }
}
}