import java.io.*;
import java.util.*;
public class Reverse{
  public static void main(String args[])throws IOException{
    String s="";
    System.out.println("Enter the input string");
    
    try
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      s = br.readLine();
      char[] c=s.toCharArray();
      for (int i=c.length-1;i>=0;i--)
      System.out.print(c[i]);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }}
