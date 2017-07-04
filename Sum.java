import java.io.*;
import java.util.*;
public class Sum{
  public static void main(String args[])throws IOException{
    Scanner s=new Scanner(System.in);
    int sum=0;
    int n=s.nextInt();
    for(int i=1;i<n;i++)
    {
      sum=sum+i;
    }
    System.out.println(sum);
  }
}
