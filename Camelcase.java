import java.io.*;
import java.util.*;
public class Camelcase{
  
  public static void main (String args[])throws IOException{
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name=br.readLine();
    StringBuffer s=new StringBuffer();
    for(String a:name.split(""))
    {
      
      s.append(Character.toUpperCase(a.charAt(0)));
      if(a.length()>1){
        
        s.append(a.substring(1, a.length()).toLowerCase());
      }
      System.out.println(s);
    }
  }
}


    
    
