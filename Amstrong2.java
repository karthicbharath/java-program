import java.io.*;
import java.util.*;
public class Amstrong2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int sum=0,temp;
    int n=s.nextInt();
    int p=s.nextInt();
    int q=s.nextInt();
    for(int i=p;i<=q;i++){
    temp=n;
    while(temp!=0)
    {
      int a=temp%10;
      temp=temp/10;
      sum=sum+(a*a*a);
    }
    if(sum==n)
    {
      System.out.println("Amstrong Number");
    }
    else
    System.out.println("not Amstrong number");
  }
}
Contact GitHub API Training Shop Blog About
© 2017 GitHub, Inc. Terms Privacy Security 
