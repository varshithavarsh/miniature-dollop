import java.util.*;
class stkrev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
Stack<Character> s=new Stack<Character>();
System.out.println("enter string");
String str=sc.next();
char[] ch = str.toCharArray();
int n = ch.length;
for(i=0;i<n;i++)
{s.push(ch[i]);}
for(i=0;i<n;i++)
System.out.print(s.pop());
}
}