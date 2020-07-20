
import java.awt.*;
import java.util.ArrayList;


public class Train
{

   private int trainX;                    // Top-Left X-Coordinate of the train
   private int trainY;                    // Top-Left Y-Coordinate of the train
   private int carCount;                  // Number of rail cars in the train.
   private ArrayList<RailCar> railCars;   // Array that stores of the <RailCar> objects
  
////////////////////////////////////////////////////////////////////////
///// This method is the first part of the solution for FRQuiz1402 /////
////////////////////////////////////////////////////////////////////////   
   
   public Train(int trainX, int trainY)
   {
      trainX = trainX;
      trainY = trainY;
      railCars = new ArrayList<RailCar>();
      carCount = 0;
   }
   
////////////////////////////////////////////////////////////////////////
  
     
   
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
   


////////////////////////////////////////////////////////////////////////
///// This method is the second part of the solution for FRQuiz1402 ////
////////////////////////////////////////////////////////////////////////
   
   public void showCars(Graphics g)
   {
      for (RailCar railCar : railCars)
         railCar.drawCar(g);
   }
   
////////////////////////////////////////////////////////////////////////
   
}

