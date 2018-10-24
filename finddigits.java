import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
            int i,a,t=0;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number and digit");
        int n=Integer.parseInt(br.readLine());
        int d=Integer.parseInt(br.readLine());
        
        for( i=0;i<=n;i++)
        {
            if(i>9)
            {
                
             t=i;
             while(t>0)
             {
             a=t%10;
           
             if(a==d)
             System.out.println(i);
               t=t/10;
            }
            }
            else
            {
                if(i==d)
                  System.out.println(i);
            }
                
            }
    }
}
        
        
    
