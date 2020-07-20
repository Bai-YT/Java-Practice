// Generics01
// This is an example of using <ArrayList> with "generics".


import java.util.ArrayList;


public class GenericsDemo
{
   public static void main (String[] args)
   {
      ArrayList<String> names = new ArrayList<String>();

      ArrayList<Person> people = new ArrayList<Person>();


   }
}


class Person
{
   private String name;
   private int age;

   public Person(String n, int a)
   {
      name = n;
      age = a;
   }
}
