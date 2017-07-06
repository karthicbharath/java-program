import java.io.*;
import java.util.*;
public class Workingday{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String a=br.readLine();
     String day=a.toLowerCase();
    switch(day)
    {
      case "monday":
      System.out.println("true");
      break;
      case "tuesday":
      System.out.println("true");
      break;
      case "wednesday":
      System.out.println("true");
      break;
      case "thursday":
      System.out.println("true");
      break;
      case "friday":
      System.out.println("true");
      break;
      case "saturday":
      System.out.println("true");
      break;
      default:
      System.out.println("false");
    }
  }
}
