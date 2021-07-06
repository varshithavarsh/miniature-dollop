import java.util.*;
class Dup
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
int i=0,j=0;
for(i=0;i<size;i++)  
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(i=0;i<size;i++)  
{
for(j=i+1;j<size;j++)  
{
if(arr[i]==arr[j])
{
System.out.print(arr[i]);
}
}
}
}
}