/*
 * A program to carry on conversations with a human user.
 * Version 2b provides the following responses:
 *    "Why so negative" when substring "no" is found.
 *    "Tell me more about your family" when relatives are found.
 *    "I don't know what to say" otherwise.
 *********************************************************** 
 * author Laurie White
 * version April 2012
 * Divided into stages and altered May 2014 by Leon Schram
 */

public class Magpie2b
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
			response = "I don't know what to say.";
		}
		return response;
	}
}
