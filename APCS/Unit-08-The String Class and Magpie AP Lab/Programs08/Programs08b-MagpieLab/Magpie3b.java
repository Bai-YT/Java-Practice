/*
 * A program to carry on conversations with a human user.
 * This version starts to correct the "no" substring logic error.
 * Variable psn means position. 
 * Magpie3b finds the word "no" in the middle of a phrase, but
 * creates exception errors when "no" is at the start or end of a phrase.   
 **************************************************************************
 * author Laurie White
 * version April 2012
 * Divided into stages and altered July 2014 by Leon Schram
 */

public class Magpie3b
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
      String response = "";
      if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = "I don't know what to say.";
		}
		return response;
	}


	private int findKeyword(String phrase, String goal)
	{
		phrase = phrase.trim();
      phrase = phrase.toLowerCase();
      goal = goal.toLowerCase();
      
      int psn = phrase.indexOf(goal);

		if (psn >= 0)
		{
			String before = " ";
         String after = " ";

			before = phrase.substring(psn - 1, psn);
         after = phrase.substring(psn + goal.length(),psn + goal.length() + 1);

         boolean beforeOK = before.compareTo("a") < 0 || before.compareTo("z") > 0; 
         boolean afterOK = after.compareTo("a") < 0 || after.compareTo("z") > 0;
         
         if (beforeOK && afterOK)	
			{
				return psn;
			}
		}

		return -1;
	}

}
