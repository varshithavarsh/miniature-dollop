import java.util.*;
class hmap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
HashMap<Integer,String> x= new HashMap<Integer,String>();
System.out.println("Enter n value");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int arr=sc.nextInt();
String s=sc.next();
x.put(arr,s);
}
TreeMap<Integer,String> t=new TreeMap <Integer,String>(x);
for(Integer i:t.keySet())
{
System.out.println(i+"="+t.get(i)+" ");
}
}
}