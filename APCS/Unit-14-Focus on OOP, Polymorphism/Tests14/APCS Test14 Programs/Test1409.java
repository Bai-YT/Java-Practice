public class Test1409
{
	public static void main(String args[])
	{
		Language l = new Language();
		German g = new German();
		Dutch d = new Dutch();
	}
}


class Language
{
	public void greeting()	{ System.out.println("Every language has a greeting"); }
}

class German
{
	public void greeting()	{ System.out.println("In German you say Guten Tag"); }
}

class Dutch
{
	public void greeting()	{ System.out.println("In Dutch you say Goeden Dag"); }
}
