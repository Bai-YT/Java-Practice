// Java1419.java
// Train case study, Stage #7
// The train case study is now ready to display.
// <RailCar> is the umbrella class
// and <drawCar> is the polymorphic method.


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Java1419 extends Applet
{
	public void paint(Graphics g)
	{
      ArrayList<RailCar> railCars = new ArrayList<RailCar>();
      railCars.add(new Locomotive(Color.blue,100,300));
      railCars.add(new PassengerCar(Color.gray,275,300));
      railCars.add(new PassengerCar(Color.gray,450,300));
      railCars.add(new PassengerCar(Color.gray,625,300));
      railCars.add(new FreightCar(Color.green,800,300));
      railCars.add(new FreightCar(Color.green,975,300));
      railCars.add(new Caboose(Color.red,1150,300));

      for (RailCar railCar : railCars)
         railCar.drawCar(g);
	}
}
