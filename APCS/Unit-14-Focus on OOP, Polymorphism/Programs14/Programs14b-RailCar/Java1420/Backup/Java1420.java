// Java1420.java
// Train case study, Stage #7b
// All the train classes are the same in Stage #7b.
// Polymorphism is now shown with the <drawTain> method.
// The umbrella is the same <RailCar> class.


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Java1420 extends Applet
{
	public void paint(Graphics g)
	{
      RailCar railCar1 = new Locomotive(Color.blue,100,300);
      RailCar railCar2 = new PassengerCar(Color.gray,275,300);
      RailCar railCar3 = new PassengerCar(Color.gray,450,300);
      RailCar railCar4 = new PassengerCar(Color.gray,625,300);
      RailCar railCar5 = new FreightCar(Color.green,800,300);
      RailCar railCar6 = new FreightCar(Color.green,975,300);
      RailCar railCar7 = new Caboose(Color.red,1150,300);

      drawTrain(g,railCar1);
      drawTrain(g,railCar2);
      drawTrain(g,railCar3);
      drawTrain(g,railCar4);
      drawTrain(g,railCar5);
      drawTrain(g,railCar6);
      drawTrain(g,railCar7);
   }

   public void drawTrain(Graphics g, RailCar railCar)
   {
      railCar.drawCar(g);
   }
}
