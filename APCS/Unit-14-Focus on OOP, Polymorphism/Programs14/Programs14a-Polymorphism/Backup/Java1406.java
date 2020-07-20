// Java1406.java
// In this program a very convoluted method is
// used to print the greeting for each language.


public class Java1406
{
	public static void main (String[] args)
	{
      English g1 = new English();
      German g2 = new German();
      Dutch g3 = new Dutch();
      French g4 = new French();
      printGreeting(g1);
      printGreeting(g2);
      printGreeting(g3);
      printGreeting(g4);
	}
   
   public static void printGreeting(Object g)
   {
      if (g instanceof English)
      {
         English temp = (English) g;
         temp.greeting();
      }
      else if (g instanceof German)
      {
         German temp = (German) g;
         temp.greeting();
      }      
      else if (g instanceof Dutch)
      {
         Dutch temp = (Dutch) g;
         temp.greeting();
      }      
      else if (g instanceof French)
      {
         French temp = (French) g;
         temp.greeting();
      }
   }            
}



class English 
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German 
{
	public void greeting()
	{
		System.out.println("In German you say Guten Tag");
	}
}

class Dutch implements Language
{
	public void greeting()
	{
		System.out.println("In Dutch you say Goeden Dag");
	}
}

class French 
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}