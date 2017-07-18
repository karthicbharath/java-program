import java.io.*;
import java.util.*;
public class Starspattern{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int row=Integer.parseInt(br.readLine());
int col=Integer.parseInt(br.readLine());
for(int i=1;i<=col;i++)
{
System.out.print("*");
System.out.print("\n");
}
for(int j=1;j<=row-2;j++)
{
System.out.print("*");
for(int k=1;k<=col-2;k++)
{
System.out.print(" ");
System.out.print("*\n");
}
}
for(int i=1;i<=cols;i++)
{
System.out.print("*");
}
}
}
