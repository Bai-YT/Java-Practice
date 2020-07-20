// Generics06
// The <int> interfaces and classes are now replaced by generics.
// All the methods are the same as in Generics05B, but now the
// a specific class can be used when instantiating a <MyList> or <MySet> object.


public interface Collection<E>
{
	public void add(E obj); 
   public boolean isEmpty();
}

interface List<E> extends Collection<E>
{
  public E get(int index);
}

interface Set<E> extends Collection<E>
{
   public boolean contain(E obj);
}

class MyList<E> implements List<E>
{
   public void add (E obj)          {  }
   public boolean isEmpty()         { return true; }
   public E get(int index)          { return null; }
}

class MySet<E> implements Set<E>
{
   public void add (E obj)          {  }
   public boolean isEmpty()         { return true; }
   public boolean contain(E obj)    { return true; }
}


   




