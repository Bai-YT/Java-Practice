// Train.java
// 02-24-15 by Leon Schram
// This is the 80-Point solution file of the Lab14b assignment.
// The <Train> encapsulates all the <RailCar> objects and methods in one class.
// The 80-Point solution only adds new cars to the end of the train.


import java.awt.*;
import java.util.ArrayList;


public class Train
{

   private int trainX;                    // Top-Left X-Coordinate of the train
   private int trainY;                    // Top-Left Y-Coordinate of the train
   private int carCount;                  // Number of rail cars in the train.
   private ArrayList<RailCar> railCars;   // Array that stores of the <RailCar> objects
   
   
   public Train(int tX, int tY)
   {
      trainX = tX;
      trainY = tY;
      railCars = new ArrayList<RailCar>();
      carCount = 0;
   }
  
     
   // This method adds a new rail car at the end of the train  
   public void addCar(String carType, Color carColor)
   {
      switch (carType)
      {
         case "Locomotive"    :  railCars.add(new Locomotive(trainX,trainY,carColor,carCount));
                                 break;
         case "FreightCar"    :  railCars.add(new FreightCar(trainX,trainY,carColor,carCount));
                                 break;
         case "PassengerCar"  :  railCars.add(new PassengerCar(trainX,trainY,carColor,carCount));
                                 break;
         case "Caboose"       :  railCars.add(new Caboose(trainX,trainY,carColor,carCount));
                                 break;
      } 
      carCount++;
   }
   
   
   // This method uses polymorphism to display each rail car properly 
   public void showCars(Graphics g)
   {
      for (RailCar railCar : railCars)
         railCar.drawCar(g);
   }
   
}

