import java.util.*; 
class iter
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
 System.out.print("Enter size of ArrayList");
   int n=sc.nextInt();
   ArrayList<Integer> a=new ArrayList<Integer>();
    System.out.print("Enter elements");
    for(int i=0;i<n;++i)
        a.add(sc.nextInt());
    System.out.print("Enter the value of k");
   int k=sc.nextInt();
    for(int j=0;j<=n;j++)
     {
        try
         {
           int num=a.get(j); 
           if(num<=k)
              a.remove(j);
     }
     catch(Exception ex)
  { 
     System.out.println("exception occured------>"+ex);}}
     System.out.println("Updated ArrayList");
    for(Integer j:a)
    {
       System.out.print(j+" ");
    }
  
}
}