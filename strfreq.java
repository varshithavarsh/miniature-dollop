import java.util.*; 
class strfreq
{
public static void main(String args[])
{ 
HashMap<String,Integer> x=new HashMap<String,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
String[] arr=new String[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.next();
}

for(int i=0;i<arr.length;i++) 
{
String key;
key=arr[i];
if(x.containsKey(key)) 
x.put(key,x.get(key)+1); 
else 
x.put(key,1);
} 
for(String i:x.keySet())
{if(x.get(i)>2)
System.out.println(i+"="+x.get(i)+" "); 
}
}
}