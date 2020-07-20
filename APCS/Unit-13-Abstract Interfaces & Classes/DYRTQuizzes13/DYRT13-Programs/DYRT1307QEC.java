import java.util.ArrayList;

public class DYRT1307QEC
{
   public static void main(String[] args)
   {
      ArrayList<String> a = new ArrayList<String>();
      a.add("a1-stuff");
      a.add("a2-stuff");
      ArrayList<String> b = new ArrayList<String>();
      b.add("b1-stuff");
      b.add("b2-stuff");
      
      ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
      x.add(a);
      x.add(b);
      
      System.out.println(x);
   }  
}



