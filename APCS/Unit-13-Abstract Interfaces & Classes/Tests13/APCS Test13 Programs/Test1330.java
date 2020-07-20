public class Test1330
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

class Italy extends WestEurope
{
   private String clientName;
   
   public Italy (String clientName)
   {
     	this.clientName = clientName;
   }
   
   public void flights()   
   { /* assume method is implemented */ }

   public void hotels()   
   { /* assume method is implemented */ }

   public void excursions()   
   { /* assume method is implemented */ }

   public void phrases()   
   { /* assume method is implemented */ }
}	



