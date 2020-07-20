/*
 * A program to carry on conversations with a human user.
 * Version 3a starts a sequence that improves "Why so negative" response.
 * Right now any "no" substring works, like in the word "know".
 * Responses about family and others are removed to focus on 
 * correcting the negative chatbot response.
 ***************************************************************************
 * author Laurie White
 * version April 2012
 * Divided into stages and altered July 2014 by Leon Schram
 */

public class Magpie3a
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
		else
		{
			response = "I don't know what to say.";
		}
		return response;
	}
}
