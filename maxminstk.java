import java.util.*;
class maxminstk
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Stack <Integer> s=new Stack<Integer>();
System.out.print("enter size");
int n=sc.nextInt();
System.out.print("enter "+n+" svalues");
for(int i=0;i<n;i++)
{
s.push(sc.nextInt());
}
System.out.print("Max ="+Collections.max(s));
System.out.print("Min ="+Collections.min(s));
}
}