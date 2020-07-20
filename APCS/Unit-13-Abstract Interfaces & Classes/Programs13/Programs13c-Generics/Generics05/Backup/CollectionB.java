// Generics05B
// In this example <Collection> is an interface.
// <List> is a subinterface, which extends <Collection>.
// <Set> is also a subinterface, which extends <Collection>.
// <MyList> implements <List> and by extension also <Collection>.
// <MySet> implements <Set> and by extension also <Collection>.


public interface CollectionB
{
	public boolean add(int nbr); 
   public boolean isEmpty();
}

interface List extends CollectionB
{
   public int get(int index);
}

interface Set extends CollectionB
{
   public boolean contain(int nbr);
}

class MyList implements List
{
   public boolean add (int nbr)     { return true; }
   public boolean isEmpty()         { return true; }
   public int get(int index)        { return 0; }
}

class MySet implements Set
{
   public boolean add (int nbr)     { return true; }
   public boolean isEmpty()         { return true; }
   public boolean contain(int nbr)  { return true; }
}


   




