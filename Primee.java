import java.io.*;
import java.util.*;
public class Primee{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
    int n=s.nextInt();
    int a=s.nextInt();
    for(int i=n;i<=a;i++)
      {         count=0;
      {
      

      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0){
          count++;
          break;
         }
      }
      
      if(count==0&&i!=1)
      {
        System.out.println(i);
      }
    }
  } 
   }
  }
