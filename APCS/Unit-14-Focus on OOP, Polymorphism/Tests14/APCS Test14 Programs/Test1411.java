public class Test1411
{
	public static void main(String args[])
	{
		Language language = new Language();
		Language german = new German();
		Language dutch = new Dutch();
	}
}


class Language
{
	public void greeting()	{ System.out.println("Every language has a greeting"); }
}

class German extends Language
{
	public void greeting()	{ System.out.println("In German you say Guten Tag"); }
}

class Dutch extends Language
{
	public void greeting()	{ System.out.println("In Dutch you say Goeden Dag"); }
}
