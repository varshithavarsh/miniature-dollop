import java.util.*;
class arraylist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> a1=new ArrayList<Integer>();
ArrayList<Integer> a2=new ArrayList<Integer>();
System.out.println("enter a1 size");
int n1=sc.nextInt();
System.out.println("enter a1 elements");
for(int i=1;i<=n1;i++)
{
int el1=sc.nextInt();
a1.add(el1);
}
System.out.println("First array"+a1);
System.out.println("enter a2 size");
int n2=sc.nextInt();
System.out.println("enter 2 elements");
for(int j=1;j<=n1;j++)
{
int el2=sc.nextInt();
a2.add(el2);
}
System.out.println("Second array"+a1);
a1.addAll(a2);
Collections.sort(a1);
System.out.println("Final list"+a1);
}
}