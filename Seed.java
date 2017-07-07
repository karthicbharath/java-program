import java.io.* ;
import java.util.*;
public class Seed{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int j,k=1,l, m;
    int n=s.nextInt();

    while(n>0)
    {
      j=n%10;
      n=n/10;
      k=k*j;
    }
    m=s.nextInt();
    
    l=k*m;
    System.out.println(l);
    }
    }
    
    
    
  
