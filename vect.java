import java.util.*;
class vect
{
public static void main(String args[])
{
Vector v=new Vector();
v.add(101);
v.add("Rama");
v.add(6.58);
v.add(102);
v.add("Gita");
v.add(8.98);
System.out.println(v+" ");
int index=v.indexOf("Gita");
v.remove(index);
for(Object obj:v)
{
System.out.print(obj+" ");
}
System.out.print("\n");
int index1=v.indexOf(6.58);
v.add(index1,9.17);
for(Object obj:v)
{
System.out.print(obj+" ");
}
System.out.print("\n");
if(v.contains("sita"))
System.out.println("found");
else
System.out.println("false! Not found");
}
}