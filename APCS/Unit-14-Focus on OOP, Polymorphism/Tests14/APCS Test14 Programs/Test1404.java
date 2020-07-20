
public class Test1404
{
	public static void main(String[] args)
	{
		Qwerty qwerty = new Qwerty();
		qwerty.boohiss(100);
	}
}

class Qwerty
{
	public void boohiss(int x)
	{
		System.out.println(x);
	}

	public void boohiss(int x, int y)
	{
		System.out.println(x + "  " + y);
	}

	public void boohiss(String s)
	{
		System.out.println(s);
	}
}

