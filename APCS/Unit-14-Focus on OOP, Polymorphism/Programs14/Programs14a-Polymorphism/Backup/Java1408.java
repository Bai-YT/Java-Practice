// Java1408.java
// This program uses polymorphism in a different way.
// The "umbrella"  <Language> is now used as the 
// element for an <ArrayList> object.


import java.util.ArrayList;

public class Java1408
{
	public static void main (String[] args)
	{
      Language g1 = new English();
      Language g2 = new German();
      Language g3 = new Dutch();
      Language g4 = new French();
      
      ArrayList<Language> languages = new ArrayList<Language>();
      languages.add(g1);
      languages.add(g2);      
      languages.add(g3);      
      languages.add(g4);
   
      for (Language language : languages)
         language.greeting();  	
   }
}


abstract interface Language
{
	public abstract void greeting();
}

class English implements Language
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German implements Language
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

class French implements Language
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}