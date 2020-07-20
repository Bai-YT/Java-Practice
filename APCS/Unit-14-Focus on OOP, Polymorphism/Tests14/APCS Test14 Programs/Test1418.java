import java.util.ArrayList;


public class Test1418
{
	public static void main(String[] args)
	{
      Language lan1 = new English();   
      Language lan2 = new German();    
      Language lan3 = new Dutch();     
      Language lan4 = new French();    
	   printGreeting(lan1);             
      printGreeting(lan2);             
      printGreeting(lan3);             
      printGreeting(lan4);             	
	}
   
   public static void printGreeting(Language obj)  
   {
         obj.greeting();                              
   }
}


interface Language
{
	public void greeting();	
}

class English implements Language
{
	public void greeting()	{ System.out.println("In English you say good day"); }
}


class German implements Language
{
	public void greeting()	{ System.out.println("In German you say Guten Tag"); }
}

class Dutch implements Language
{
	public void greeting()	{ System.out.println("In Dutch you say Goeden Dag"); }
}

class French implements Language
{
	public void greeting()	{ System.out.println("In French you say Bonjour"); }
}