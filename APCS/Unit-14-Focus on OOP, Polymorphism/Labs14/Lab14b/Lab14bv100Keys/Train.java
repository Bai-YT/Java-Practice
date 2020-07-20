// Train.java
// 02-24-15 by Leon Schram
// This is the 100-Point solution file of the Lab14b assignment.
// The <Train> encapsulates all the <RailCar> objects and methods in one class.

/////////////////////////////////////////////////////////////////////////////////////////////
// IMPORTANT NOTE ABOUT THE 100-POINT VERSION
//
// Inserting a new <RailCar> object in the middle of an existing train has a special problem.
// For inheritance, polymorphism and efficiency, part of every rail car is first drawn
// by the <drawCar> method of the superclass <RailCar> object.
// Every subclass of <RailCar>, <Locomotive>, <FreightCar>, <PassengerCar and <Caboose>
// re-define the <drawCar> method.  This is the method that demonstrates polymorphism.
// 
// Note the <drawCar> method of the <FreightCar> class below:
//
//	   public void drawCar(Graphics g)
//	   {
//		   super.drawCar(g);
//		   drawFreightDoors(g);
//	   }
//
// The method starts with the "super.drawCar(g)" statement.
// This statement is used in all the subclasses of the <RailCar> class.
// It creates efficiency with inheritance by not rewriting code that already exists.
// The superclass <drawCar> draws the fundamental rail car and the subclass finishes the job.
//
// The <drawCar> methods depends on the (carX,carY) coordinates to draw each car correctly.
// These coordinates are computed based on the relative position of the car from (trainX,trainY).
// (trainX,trainY) is the top-left coordinate position of the first car in the train.
// For the 80-point version each new car is attached to the end.
// If all the graphics statements are relative to (carX,carY) the display has no problems.
//
// There is a unique problem with the 100-point version.
// When a new <RailCar> object is inserted in an existing train sequence, care must be taken with 
// the re-assignment of the (carX,carY) values of objects that are moved to a new location.
// 
// In each subclass of the 100-point version, the following method appears:
//
//    public void setPos (int cP)
//    {
//       super.setPos(cP);
//       carPos = cP;
//       carX = trainX + carPos * 175;
//    }
//
// The significance is that the "super.setPos(cP)" is absolutely vital.
// It is not sufficient to reset the (carX) coordinate of the objects to be moved.
// Since drawing of the train starts with a partial drawing, courtesy of the superclass,
// it is possible to get some bizarre results.  
// The <setPos> call to the superclass insures that the new coordinates of (carX,carY) 
// also go to the superclass to draw its part correctly.
// Since the train is linear, it really only involves a change in the (carX) coordinate value.
//
////////////////////////////////////////////////////////////////////////////////////////////////////


import java.awt.*;
import java.applet.*;
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
   
   
   // The overloaded addCar method inserts a new rail car at a specified location 
   public void addCar(int carPos, String carType, Color carColor)
   {
      switch (carType)
      {
         case "Locomotive"    :  railCars.add(carPos,new Locomotive(trainX,trainY,carColor,carCount));
                                 break;
         case "FreightCar"    :  railCars.add(carPos,new FreightCar(trainX,trainY,carColor,carCount));
                                 break;
         case "PassengerCar"  :  railCars.add(carPos,new PassengerCar(trainX,trainY,carColor,carCount));
                                 break;
         case "Caboose"       :  railCars.add(carPos,new Caboose(trainX,trainY,carColor,carCount));
                                 break;
      } 
      carCount++;
           
      for (int carIndex = carPos; carIndex < railCars.size(); carIndex++)
         railCars.get(carIndex).setPos(carIndex); 
   }

   // This method uses polymorphism to display each rail car properly 
   public void showCars(Graphics g)
   {
      for (RailCar railCar : railCars)
         railCar.drawCar(g);
   }
   
}

