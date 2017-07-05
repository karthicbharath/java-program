import java.io.*;
import java.util.*;
public class Reversedigit{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int n=0;
    while(a>0)
    {
      int b=a%10;
      a=a/10;
      n=n*10+b;
    }
    System.out.println(n);
  }
}
