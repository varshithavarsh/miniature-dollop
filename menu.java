import java.util.*;
class menu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList<Integer> menu=new LinkedList<Integer>();
int size=sc.nextInt();
int n,y,index;
System.out.println("enter elements");
for(int i=0;i<size;i++)
menu.add(sc.nextInt());
System.out.println("1.BeginInsert \n2.EndInsert\n3.Position Insert\n4.Begin Delete\n5.End Delete\n6.Position Delete\n7.Display\n8.Exit1\n.....Enter your Choice:");
y=sc.nextInt();
do
{
switch(y)
{
case 1: System.out.println("Enter n value");
n=sc.nextInt();
menu.addFirst(n);
System.out.println(menu);
break;
case 2: System.out.println("Enter n value");
n=sc.nextInt();
menu.addLast(n);
System.out.println(menu);
break;
case 3: System.out.println("Enter n value");
n=sc.nextInt();
index=menu.indexOf(n);
menu.add(index,n);
 System.out.println(menu);
break;
case 4:
menu.removeFirst();
System.out.println(menu);
break;
case 5: 
menu.removeLast();
System.out.println(menu);
break;
case 6: System.out.println("Enter n value");
n=sc.nextInt();
index=menu.indexOf(n);
menu.remove(index);
System.out.println(menu);
break;
case 7: System.out.println(menu);
break;
default: System.out.println("Invalid Choice");
}
System.out.println("1.BeginInsert\n2.EndInsert \n3. Position Insert\n4. Begin Delete\n5. End Delete\n6. Position Delete\n7. Display\n8. Exit1\n.....Enter your Choice:");
y=sc.nextInt();
}while(y<8);
}
}