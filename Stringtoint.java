import java.io.*;
import java.util.*;
public class Stringtoint{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
int i=Integer.parseInt(br.readLine());
System.out.println(s+200);
System.out.println(i-100);
}
}
