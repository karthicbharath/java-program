import java.io.*;
import java.util.*;
public class Large{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
if((a>b)&&(a>c))
{
System.out.println(a+" is large");
}
else if((b>a)&&(b>c))
{
System.out.println(b+" is large");
}
else
System.out.println(c+" is large");
}
}
