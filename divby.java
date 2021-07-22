import java.util.*; 
class divby
{
public static void main(String args[])
{ 
HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int[] a=new int[n];
int temp=0,r=0;
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) 
{
int key;
key=a[i];
if(key%3==0)
{
x.put(3,temp+1); 
temp=temp+1;
} 
else if(key%5==0)
{
x.put(5,r+1); 
r=r+1;
}
}
for(Integer i:x.keySet())
{
System.out.println(i+"="+x.get(i)+" ");
}
}
}