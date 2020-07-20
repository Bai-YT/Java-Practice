abstract interface Boohiss1
{
	public abstract void qwerty1();
	public abstract void qwerty2();
}

abstract class Boohiss2 implements Boohiss1
{
	public void qwerty1()
	{
	}
}

class Boohiss3 extends Boohiss2
{
	public void qwerty2()
	{
	}

//	public abstract void qwerty3();
}

