public class Test0924
	{
	    public static void main (String args[ ])
	    {
         Qwerty balloon = new Qwerty();
         // Qwerty.balloon();
         // Qwerty = new balloon();
         // balloon = new Qwerty;
	    }
	}

	class Qwerty
   {
      private int start;
      private int max;
      
      /*
      public static void Qwerty()
      {
         start = 0;
         max = 1000;
      }
      */
      
      public Qwerty()
      {
         start = 0;
         max = 1000;
      }
      
      public Qwerty(int s, int m)
      {
         start = s;
         max = m;
      }  
	}
