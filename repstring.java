import java.util.*;
class repstring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer str=new StringBuffer();
str.insert(0,sc.next());
System.out.println("Enter number of operations");
int o=sc.nextInt();
for(int i=1;i<=o;i++)
{
System.out.println("Enter position and character");
int pos=sc.nextInt();
char ch=sc.next().charAt(0);
str.setCharAt(pos-1,ch);
}
System.out.println(str);
System.out.println("Enter number of operations");
int p=sc.nextInt();
for(int i=1;i<=p;i++)
{
int r1=sc.nextInt();
int r2=sc.nextInt();
char a=str.charAt(r1-1);
char b=str.charAt(r2-1);
str.setCharAt(r1-1,b);
str.setCharAt(r2-1,a);
}
System.out.println(str);
}
}