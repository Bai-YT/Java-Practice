// AbstractClass02
// This program tests the abstract interface and 
// its four implementing classes.


public class Test02
{
   public static void main(String[] args)
   {
      HighSchool tom = new Grade09();
      HighSchool sue = new Grade10();
      HighSchool bob = new Grade11();
      HighSchool ann = new Grade12();
      
      System.out.println("TEST 9TH GRADE TOM");    
      tom.information();
      tom.test();
      tom.emergency();
      tom.computeGPA();
      tom.progress();
      tom.attendance();
      tom.dressCode();
      tom.residence();
      tom.register();
      tom.orientation();
      tom.fundRaising();
      tom.socialEvents();
      tom.parking(); 
      System.out.println();  
      
      System.out.println("TEST 10TH GRADE SUE");    
      sue.information();
      sue.test();
      sue.emergency();
      sue.computeGPA();
      sue.progress();
      sue.attendance();
      sue.dressCode();
      sue.residence();
      sue.register();
      sue.orientation();
      sue.fundRaising();
      sue.socialEvents();
      sue.parking(); 
      System.out.println();
      
      System.out.println("TEST 11TH GRADE BOB");    
      bob.information();
      bob.test();
      bob.emergency();
      bob.computeGPA();
      bob.progress();
      bob.attendance();
      bob.dressCode();
      bob.residence();
      bob.register();
      bob.orientation();
      bob.fundRaising();
      bob.socialEvents();
      bob.parking(); 
      System.out.println();
      
      System.out.println("TEST 12TH GRADE ANN");    
      ann.information();
      ann.test();
      ann.emergency();
      ann.computeGPA();
      ann.progress();
      ann.attendance();
      ann.dressCode();
      ann.residence();
      ann.register();
      ann.orientation();
      ann.fundRaising();
      ann.socialEvents();
      ann.parking(); 
      System.out.println();      
   }
}

