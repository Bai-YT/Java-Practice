public class Test1413
{
	public static void main(String args[])
	{
		Language german = new German();
		Language dutch = new Dutch();
	}
}


interface Language
{
	public void greeting();
}

class German implements Language
{
	public void greeting()	{ System.out.println("In German you say Guten Tag"); }
}

class Dutch implements Language
{
	public void greeting()	{ System.out.println("In Dutch you say Goeden Dag"); }
}
