// Utility.java
// This file contains useful methods that can be used by several different programs.


import java.awt.*;
import java.applet.*;


public class Utility
{
	public static int random(int min, int max)
	{
      int range = max - min + 1;
      int randomNumber = (int)(Math.random() * range) + min;
	   return randomNumber;
	}

	public static void setBackground(Graphics g, Color c)
	{
     	g.setColor(c);
      	g.fillRect(0,0,1000,650);
	}

	public static void setRandomColor(Graphics g)
	{
      int red   = random(0,255);
      int green = random(0,255);
      int blue  = random(0,255);
      g.setColor(new Color(red, green, blue));
  	}

  	public static void skip(int n)
  	{
  		for (int j = 1; j <= n; j++)
  			System.out.println();
  	}

  	public static void rightJustify(String text)
  	{
  		int len = text.length();
  		int numSpaces = 80 - len;
  		for (int j = 1; j <= numSpaces; j++)
  			System.out.print(" ");
  		System.out.println(text);
  	}

  	public static void center(String text)
  	{
  		int len = text.length();
  		int numSpaces = (80 - len) / 2;
  		for (int j = 1; j <= numSpaces; j++)
  			System.out.print(" ");
  		System.out.println(text);
  	}
}
