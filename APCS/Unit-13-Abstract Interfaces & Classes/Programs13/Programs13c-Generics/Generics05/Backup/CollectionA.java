// Generics05A
// In this example <Collection> is an interface.
// <List> is a subinterface, which extends <Collection>.
// <MyList> implements <List> and by extension also <Collection>.
// This is not a practical example of using a subinterface.


public interface CollectionA
{
	public boolean add(int nbr); 
   public boolean isEmpty();
}

interface List extends CollectionA
{
  public int get(int index);
}

class MyList implements List
{
   public boolean add (int nbr)  { return true; }
   public boolean isEmpty()      { return true; }
   public int get(int index)     { return 0; }
}
   




