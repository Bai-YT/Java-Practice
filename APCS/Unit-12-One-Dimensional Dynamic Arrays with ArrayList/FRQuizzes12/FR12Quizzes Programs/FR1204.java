
import java.util.Scanner;

public class FR1204
{
	public static void main(String[] args)
	{
		Magpie maggie = new Magpie();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class Magpie
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
	  	String[] response = 
     	{  "Do you like today's weather?",
        	"I wish it was not so humid.",
        	"Do you like sports?",
        	"What is your favorite holiday?" };
         
     	int n = response.length;
     	int rnd = (int) (Math.random() * n);
     	return response[rnd];
	}
}
