import java.util.*;
class evenoddplaces
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
if(i%2==0&&a[i]%2==0)
{ 
a[i]=a[i];
}
else if(i%2!=0&&a[i]%2!=0)
{
a[i]=a[i];
}
}

System.out.println(Arrays.toString(a));
}
}