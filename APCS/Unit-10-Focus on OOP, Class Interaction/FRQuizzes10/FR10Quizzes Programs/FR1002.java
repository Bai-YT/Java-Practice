
public class FR1002
{
   public static void main(String[] args)
   {
      Pidget pidget = new Pidget(100,200);
      System.out.println(pidget.getPidgets());
      System.out.println(pidget.getWidgets());
   }   
}


class Widget
{
	private int numWidgets;
	
	public Widget(int nw)
	{
		numWidgets = nw;
	}
	
	public int getWidgets()	
	{
		return numWidgets;	
	}
}

class Pidget extends Widget
{
	private int numPidgets;
	
	public Pidget(int nw, int np)
	{
		super(nw);
		numPidgets = np;
	}
	
	public int getPidgets()
	{
		return numPidgets;
	}	
}
