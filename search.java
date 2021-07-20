import java.util.*;
import java.io.*;

class search
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> x=new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            x.put(name,phone);
        }
            
         //while(in.hasNext())
        try
        {
        for(int j=0;j<n;j++)
        {
            String s = in.next();  
            // Write code here
            if(x.containsKey(s))
            System.out.println(s+"="+x.get(s));
            else
            System.out.println("Not found");
        }}catch(Exception e){}
        in.close();
    }
}
