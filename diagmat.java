import java.util.*;
class diagmat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
int i,j,temp=0;
System.out.println("Enter elements");
int a[][]=new int[n][n];
for(i=0;i<n;i++)
{
  for(j=0;j<n;j++)
   { 
     a[i][j]=sc.nextInt();
   }
}
for(i=0;i<n;i++)
{
  for(j=0;j<n;j++)
   { 
     if(i==j)
       {
         if(a[i][j]!=0)
          temp=1;
       }
     else
       {
         if(a[i][j]==0)
          temp=1;
       }
    }
}
if(temp==0)
System.out.println("Diagonal Matrix");
else
System.out.println("Not a Diagonal Matrix");
}
}