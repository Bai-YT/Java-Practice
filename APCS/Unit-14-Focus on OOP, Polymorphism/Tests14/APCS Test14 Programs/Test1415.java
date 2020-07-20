import java.util.ArrayList;


public class Test1415
{
	public static void main(String args[])
	{
		ArrayList<Language> countries = new ArrayList<Language>();

		countries.add(new Language());
		countries.add(new English());
		countries.add(new German());
		countries.add(new Dutch());
		countries.add(new French());

		for (Language country: countries)
			country.greeting();
	}
}


class Language
{
	public void greeting()	{ System.out.println("Every language has a greeting"); }
}

class English extends Language
{
	public void greeting()	{ System.out.println("In English you say good day"); }
}


class German extends Language
{
	public void greeting()	{ System.out.println("In German you say Guten Tag"); }
}

class Dutch extends Language
{
	public void greeting()	{ System.out.println("In Dutch you say Goeden Dag"); }
}

class French extends Language
{
	public void greeting()	{ System.out.println("In French you say Bonjour"); }
}