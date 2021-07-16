import java.util.*;
class arrayupdate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
ArrayList<Integer> a=new ArrayList<Integer>();
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
a.add(sc.nextInt());
}
System.out.println("Enter value in array and the value to update");
int v=sc.nextInt(); 
int uv=sc.nextInt();
if(a.contains(v))
{
int in=a.indexOf(v);
a.set(in,uv);
for(Integer i:a)
{
System.out.print(i+" ");
}
}
else
{
System.out.println("false.Updation not possible");
}

}
}