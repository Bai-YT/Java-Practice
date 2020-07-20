public class Test1329
{
   public static void main(String[] args)
   {
   }
}

abstract interface Europe
{
	public abstract void flights();
   public abstract void railpass();
   public abstract void documentation();
	public abstract void money();
   public abstract void hotels();
   public abstract void excursions();
   public abstract void phrases();
}

abstract class WestEurope implements Europe
{
   public void railpass()      
   { /* assume method is implemented */ }
   public void documentation(){ }
   { /* assume method is implemented */ }
   public void money()        { }
   { /* assume method is implemented */ }
}
