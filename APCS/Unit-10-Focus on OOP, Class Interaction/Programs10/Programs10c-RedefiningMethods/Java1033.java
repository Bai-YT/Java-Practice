// Java1033.java
// The <toString> method is re-defined to always return
// the "Aardvark" string, regardless of the attribute values.


public class Java1033
{
   public static void main (String[] args)
   {
      Student student1 = new Student("Tom",21,3.85);
      Student student2 = new Student("Sue",17,3.65);
      Student student3 = new Student("Bob",18,2.85);
      System.out.println(student1);
      System.out.println(student2);
      System.out.println(student3);
   }
}


class Student
{
   private String name;
   private int age;
   private double gpa;
   
   public Student(String n, int a, double g)
   {
      name = n;
      age = a;
      gpa = g;
   }
   
  public String toString()
  {
     return "Aardvark";
  }
}

