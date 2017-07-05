import java.io.*;
import java.util.*;
public class Amstrong{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0)
{
int a=n%10;
n=n/10;
sum=sum+(r*r*r);
}
if(sum==temp)
{
System.out.println("Amstrong Number");
}
else
System.out.println("not Amstrong number");
}
}
