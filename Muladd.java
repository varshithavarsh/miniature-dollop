import java.util.*;
class Muladd
 {
public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1,a=0;
        int r=0;
        while(n!=0)
        {
            r=n%10;
            a=a+r;
            m=m*r;
            n=n/10;
        }
        System.out.println(m-a);
    }
}