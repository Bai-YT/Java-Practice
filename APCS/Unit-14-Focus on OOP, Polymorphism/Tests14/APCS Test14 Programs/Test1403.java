public class Test1403
{
	public static void main(String[] args)
	{
		Qwerty qwerty = new Qwerty();
		qwerty.boohiss();
	}
}

class Qwerty
{
	public void boohiss()
	{
		System.out.println("boohiss 1");
	}

	public void boohiss()
	{
		System.out.println("boohiss 2");
	}

	public void boohiss()
	{
		System.out.println("boohiss 3");
	}
}
