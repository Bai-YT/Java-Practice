// RailCar.java
// 02-24-15 by Leon Schram
// This is the 80 & 100-Point solution file of the Lab14b assignment.
//
// The <RailCar> class is not used to construct objects for the train.
// This class is the superclass for <Locomotive>, <FreightCar>, <PassengerCar> and <Caboose>.
// <RailCar> is the umbrella class that facilitates polymorphism with the <drawCar> method.
// Furthermore, the <drawCar> method of this superclass draws the foundation for every rail car.
// All drawing is done relative from the (trainX,trainY) coordinate of the train.


import java.awt.*;
                   
   
public class RailCar
{
   private int trainX;
   private int trainY;
   private int carPos;
	private Color carColor;
   private int carX;
   private int carY;

	public RailCar(int tX, int tY, Color cC, int cP)
	{
      trainX = tX;
      trainY = tY;
      carPos = cP;
      carX = trainX + 175 * carPos;
      carY = trainY;
		carColor = cC;
	}
   
   public int getPos()  
   {
      return carPos;
   }
   
   public void setPos (int cP)
   {
      carPos = cP;
      carX = trainX + carPos * 175;
   }
    
	public void drawCar(Graphics g)
	{
      drawContainer(g);
      drawRailWheels(g);
      drawLink(g);
	}
   
   private void drawContainer(Graphics g)
   {
   	g.setColor(carColor);
   	g.fillRect(carX,carY,150,100);
   }
   
   private void drawRailWheels(Graphics g)
   {
   	g.setColor(Color.black);
		g.fillOval(carX+5,carY+75,50,50);
		g.fillOval(carX+95,carY+75,50,50);  
	}
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.black);
      g.fillRect(carX-25,carY+80,25,5);
   } 
}

