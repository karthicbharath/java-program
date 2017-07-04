import java.io.*;
import java.util.*;
public class Alphabet{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c=br.readLine().charAt(0);
if((c>='a'&&c>='z')||(c>='A'&&c>='Z'))
{
System.out.println(c+" is Alphabet");
}
else
System.out.println(c+" is not Alphabet");
}
}
