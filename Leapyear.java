import java.io.*;
import java.util.*;
public class Leapyear{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a=Integer.parseInt(br.readLine());
    if((a%400==0)||(a%100!=0)&&(a%4==0))
    {
      System.out.println(a+" is a leap year");
    }
    else
    System.out.println(a+" is not a leap year");
  }
}
