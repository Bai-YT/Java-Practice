// Lab12av100.java     This is the 100-Point solution.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.ArrayList; 
import java.util.Scanner;

public class Lab12av100
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

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


class MagpieLab12a
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
				|| statement.indexOf("brother") >= 0
            || statement.indexOf("family") >= 0
            || statement.indexOf("parent") >= 0)
		{
			response = getFamilyResponse();
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
         "What is your favorite holiday?",
         "Have you seen a movie recently?",
         "What is your favorite music?",
         "What is your favorite country to visit?",
         "What is your favorite alltime movie?",
         "I like historical fiction books and movies.",
         "Who do you think will win the Super Bowl?" };
         
      int n = response.length;
      int rnd = (int) (Math.random() * n);
      return response[rnd];
   }
   
   private String getFamilyResponse()
	{
      ArrayList<String> response = new ArrayList<String>();
      response.add("Does your family live close together?");
      response.add("Does your family come together for the holidays?");
      response.add("Tell me about your parents.");
      response.add("Tell me about your brothers and sisters.");  
      response.add("How many brothers and sisters do you have?");
      response.add("I like playing with my little sister.");
      response.add("Does your grandfather tell nice stories?");
      response.add("My grandparents live on a farm.");
      response.add("Where were you born?");
      response.add("Tell me how your parents met.");
               
      int n = response.size();
      int rnd = (int) (Math.random() * n);
      return response.get(rnd);
   }

          
}
