import java.io.*;
import java.util.*;
public class Time{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int hour1=s.nextInt();
    int min1=s.nextInt();
    int tmin=hour1*60;
    tmin+=min1;
    int hour2=s.nextInt();
    int min2=s.nextInt();
    int Tmin=hour2*60;
    Tmin+=min2;
    int min=Tmin-tmin;
    System.out.println(min);
  }
}
