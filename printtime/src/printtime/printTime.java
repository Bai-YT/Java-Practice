package printtime;

public class printTime {

	public static void main(String[] args) {
	PTime(10000);
	System.out.println("We use \\n to go to new line \n 8/3 is 2, not 2.666");

	}
public static void PTime(int scnd)
{
	int HH, MM, SS;
	HH = scnd / 3600;
	scnd = scnd - HH * 3600;
	MM = scnd / 60;
	scnd = scnd - MM * 60;
	SS = scnd;
	System.out.println(HH + ":" + MM + ":" + SS);
}
}
