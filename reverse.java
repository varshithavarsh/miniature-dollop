import java.util.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
str=sc.nextLine();
String c[]=str.split(" ");
int n=c.length;
for(int i=0;i<n;i++)
{
String s=c[i];
int r=s.length();
for(int j=r-1;j>=0;j--)
System.out.print(s.charAt(j));  
System.out.print(" ");
}
}
}