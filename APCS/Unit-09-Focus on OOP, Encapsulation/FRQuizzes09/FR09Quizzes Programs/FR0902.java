
public class FR0902
{
   public static void main(String[] args)
   {
     Widget w = new Widget(100);
     System.out.println(w.getWidgets());
     w.setWidgets(1000);
     System.out.println(w.getWidgets());
   }
}

class Widget
{
   public int numWidgets;
   
   public Widget(int nW)
   {
      numWidgets = nW;
   }
   
   public int getWidgets()
   {
      return numWidgets;
   }
   
   public void setWidgets(int nW)
   {
      numWidgets = nW;
   }
}