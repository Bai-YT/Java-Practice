// Java0806.java
// There is a an overloaded <indexOf> method, which uses a
// second parameter to indicate the start of the search


public class Java0806
{
	public static void main (String[] args)
	{
		String str = "Mississippi is a state and it is a river.";
      System.out.println(str.indexOf("is"));
      System.out.println(str.indexOf("is",2));
      System.out.println(str.indexOf("is",10));
      System.out.println(str.indexOf("is",15));
	}
}
