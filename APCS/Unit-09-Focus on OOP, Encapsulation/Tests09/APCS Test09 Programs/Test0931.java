public class Test0931
{
   public static void main (String args[ ])
   {
      Widget widget = new Widget(12);
      System.out.println(widget.getWidgets());
   }
}


class Widget
{
   private int numWidgets;

   public Widget(int numWidgets)
   {
      numWidgets = numWidgets;
   }

   public int getWidgets()
   {
      return numWidgets;
   }
}

