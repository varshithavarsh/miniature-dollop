import java.util.*;
class tabhash
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Hashtable<Integer,Integer> x= new Hashtable<Integer,Integer>();
System.out.println("Enter n value");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
int arr=sc.nextInt();
int s=sc.nextInt();
x.put(arr,s);
}
System.out.println(x);
System.out.println("Enter key value");
int key=sc.nextInt();
if(x.containsKey(key))
{
int y=x.get(key)+5000;
x.put(key,y);
System.out.println(x);
}
else
System.out.println("Not found");
}
}