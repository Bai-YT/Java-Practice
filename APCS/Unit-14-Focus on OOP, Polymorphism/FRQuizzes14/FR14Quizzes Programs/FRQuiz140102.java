// This program demonstrates solution for both
// FRQuiz1401 and FRQuiz1402 in the RailCar class and the Train class.


import java.awt.*;
import java.applet.*;


public class FRQuiz140102 extends Applet
{
	public void paint(Graphics g)
	{
      Train train = new Train(100,300);
      train.addCar("Locomotive",Color.blue);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar("PassengerCar",Color.gray);
      train.addCar("FreightCar",Color.green);
      train.addCar("Caboose",Color.red);
      train.addCar("FreightCar",Color.green);
      train.showCars(g);
	}
}

