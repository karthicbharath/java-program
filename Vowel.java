import java.io.*;
import java.util.*;
public class Vowel{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    char c=br.readLine().charAt(0);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    {
      System.out.println(c+" is vowel");
    }
    else
    System.out.println(c+" is consonant");
  }
}
