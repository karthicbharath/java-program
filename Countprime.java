import java.io.*;
import java.util.*;
public class Countprime{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in); 
    int count=0,num=0;
    int m=s.nextInt();
    int n=s.nextInt();
    for(int i=m;i<=n;i++)
    {
      count=1;
      for(int j=2;j<=i;j++)
      {
        if(i%j==0)
        count++;
        
      }
    
    if(count==2)
    {
      num++;  
    }
    }  
    System.out.println("total count= "+num);
  
    }
  
}  
   
