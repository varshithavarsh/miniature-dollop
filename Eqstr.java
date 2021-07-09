import java.util.*;
class Eqstr
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string:");
str=sc.next();
int u=0,l=0,d=0,s=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(Character.isUpperCase(ch[i]))
{u++;
a=1;}
else if(Character.isLowerCase(ch[i]))
{l++;
b=1;}
else if(Character.isDigit(ch[i]))
{d++;
x=1;}
else
{s++;
y=1;}
}
if(u==l||u==l&&l==d||u==l&&l==d&&d==s)
System.out.println("Yes");
else
System.out.println("No");
}}