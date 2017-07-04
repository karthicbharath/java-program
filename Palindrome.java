import java.io.*;
import java.util.*;
public class Palindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int r,sum=0,temp;
    int n=sc.nextInt();
    temp=n;
    while(n>0)
    {
      r=n%10;
      n=n/10;
      sum=sum*10+r ;
    }
    if(temp==sum)
    {
      System.out.println("palindrome number");
    }
    else
    System.out.println("not Palindrome number");
  }
}
    
