/*
 * A program to carry on conversations with a human user.
 * This version shows an abbreviated style of programming
 * used by Laurie White in her version.
 * This version also handles "I know of no way" with a loop
 * and a single "no" response.
 *
 ************************************************************
 * author Laurie White
 * version April 2012
 * Divided into stages and altered July 2014 by Leon Schram
 */

public class Magpie3d
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "I want", 0) >= 0)
		{
			response = "Would you really be happy if you had " + statement.substring(findKeyword(statement, "I want", 0) + 7);
		}
		else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}	
		else
        {
			response = "I don't know what to say";
		}
		
		return response;
	}

	private int findKeyword(String statement, String goal,int startPos)
	{
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos); 

		while (psn >= 0)
		{
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),psn + goal.length() + 1).toLowerCase();
			}
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) 
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal.toLowerCase(),psn + 1);

		}
		return -1;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}
}
