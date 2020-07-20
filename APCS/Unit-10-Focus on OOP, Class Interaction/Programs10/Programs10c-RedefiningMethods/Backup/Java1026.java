// Java1026.java
// This program intentional extends the two classes with
// Object as the superclass.  This is done automatically.


public class Java1026 extends Object
{
	public static void main (String[] args)
	{
		Qwerty q = new Qwerty();
	}
}

class Qwerty extends Object
{
	public Qwerty()
	{
		System.out.println("Constructing Qwerty Object");
	}
}

