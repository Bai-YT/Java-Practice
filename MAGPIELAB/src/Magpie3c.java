/*
 * A program to carry on conversations with a human user.
 * This version starts to correct the "no" substring logic error.
 * Variable psn means position. 
 * Magpie3c finds "no" at the start, middle and end of the phrase.
 * There is a problem with a phrase like "I know of no other way"
 * and "no" by itself also causes problems.   
 *******************************************************************
 * author Laurie White
 * version April 2012
 * Divided into stages and altered July 2014 by Leon Schram
 */

public class Magpie3c
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
      String before = " ";
      String after = " ";
      
      int psn = phrase.indexOf(goal);

      if (psn == 0)  // case when "no" starts the phrase
      {
         after = phrase.substring(psn + goal.length(), psn + goal.length() + 1); 
         boolean afterOK = after.compareTo("a") < 0 || after.compareTo("z") > 0;       
         if (afterOK)	
			{
				return psn;
			}
      }
      else if (psn + goal.length() == phrase.length())  // case when "no" ends the phrase
      {
         before = phrase.substring(psn - 1, psn);
         boolean beforeOK = before.compareTo("a") < 0 || before.compareTo("z") > 0;
         if (beforeOK)	
			{
				return psn;
			}
      }
		if (psn > 0)  // case when "no" is in the middle of the phrase
		{
			before = phrase.substring(psn - 1, psn);
         after = phrase.substring(psn + goal.length(),psn + goal.length() + 1);
         boolean beforeOK = before.compareTo("a") < 0 || before.compareTo("z") > 0; 
         boolean afterOK = after.compareTo("a") < 0 || after.compareTo("z") > 0; 
         if (beforeOK && afterOK)	
			{
				return psn;
			}
		}   
		return -1;   // case when "no" is not found
	}

}
