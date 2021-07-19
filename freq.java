import java.util.*; 
class freq
{
public static void main(String args[])
{ 
HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(int i=0;i<n;i++) 
{
int key;
key=a[i];
if(x.containsKey(key)) 
x.put(key,x.get(key)+1); 
else 
x.put(key,1);
} 
for(Integer i:x.keySet())
{
if(x.get(i)>1)
System.out.println(i+"="+x.get(i)+" "); 
}
}
}