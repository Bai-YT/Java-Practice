package project;

public class RaceCar extends Car{
	int fullspeed;
	boolean Cruze;
	
	public RaceCar()
	{
		System.out.println("Inside Racecar Empty constructor");
	}
	public RaceCar(int fs, boolean cr)
	{
		fullspeed=fs; Cruze = cr;
	System.out.println("Inside Car Parameterised constructor");
}
	public String toString()
	{
	return super.toString() + " Speed : " + fullspeed +" Cruze : "+Cruze;

	}
}