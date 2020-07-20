// Generics07
// <Runner07> the difference between the <MyList> and <MySet>
// implementations.  Note how the <add> method is not the same
// for a list or a set.  A set does not contain duplicate objects.


public class Runner07
{
   public static void main(String[] args)
   {
      MyList<String> cats = new MyList<String>(1000);
      cats.add("Tiger");
      cats.add("Lion");
      cats.add("Leopard");
      cats.add("Cheetah");
      cats.add("Panther");
      cats.add("Leopard");
      System.out.println(cats);
  
      MySet<String> birds = new MySet<String>(1000);
      birds.add("Eagle");
      birds.add("Falcon");
      birds.add("Owl");
      birds.add("Pigeon");
      birds.add("Cardinal");
      birds.add("Falcon");
      System.out.println(birds);
   }
}
