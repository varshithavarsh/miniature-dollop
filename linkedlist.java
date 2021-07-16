import java.util.*;
class linkedlist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
LinkedList<Integer> arr=new LinkedList<Integer>();
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
arr.add(sc.nextInt());
}
System.out.println("enter value to search");
int d=sc.nextInt();
if(arr.contains(d))
{
int index=arr.indexOf(d);
arr.remove(index);
for(Integer i:arr)
{
System.out.print(i+" ");
}
}
else
System.out.println("element not found");
}
}