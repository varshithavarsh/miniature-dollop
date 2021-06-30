import java.util.*;
class Rev
{
public static void main(String args[])
{
int n,r=0,s=0,m=0,i=0;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  while(n>0)
  { r=n%10;
  s=s*10+r;
  n=n/10;
  }
   while(n<0)
  { r=n%10;
  s=((s*10)+r);
  n=n/10;
  }
  System.out.print(s);
}
}
