import java.io.*;
import java.util.*;
public class Amstrong{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int sum=0,temp;
    int n=s.nextInt();
    temp=n;
    while(n!=0)
    {
      int a=n%10;
      n=n/10;
      sum=sum+(a*a*a);
    }
    if(sum==temp)
    {
      System.out.println("Amstrong Number");
    }
    else
    System.out.println("not Amstrong number");
  }
}
