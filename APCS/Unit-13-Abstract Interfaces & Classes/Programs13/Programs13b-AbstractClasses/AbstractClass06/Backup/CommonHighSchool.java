// AbstractClass06
// This abstract class has a constructor.
// This stage tests to see if a constructor in an abstract class
// can be called and used by a subclass.


public abstract class CommonHighSchool implements HighSchool
{

   public CommonHighSchool()
   {
      System.out.println("CommonHighSchool Constructor");
   }

	public void information()  
   { System.out.println("Process STUDENT information"); }      
	public void test()         
   { System.out.println("Administer pre-enrollment STUDENT testing"); }    
	public void emergency()    
   { System.out.println("Gather STUDENT emergency forms"); }    
	public void computeGPA()   
   { System.out.println("Compute STUDENT GPA "); }    
   public void progress()     
   { System.out.println("Mail STUDENT progress report"); }       
   public void attendance()   
   { System.out.println("Take STUDENT attendance"); }    
   public void dressCode()    
   { System.out.println("Pass out STUDENT dresscode policies"); }        
   public void residence()    
   { System.out.println("Process STUDENT residence proof"); }            
}



