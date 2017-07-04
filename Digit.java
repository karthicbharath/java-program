import java.io.*;
import java.util.*;
public class Digit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int count=0;
int n=s.nextInt();
 while(n != 0)
    {
        n = n/10;
        ++count;
    }
    System.out.println(count);
    }
    }
