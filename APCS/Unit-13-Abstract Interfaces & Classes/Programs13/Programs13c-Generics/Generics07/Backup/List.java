// Generics07
// The <List> subinterface adds the <get> method to the
// <add> and <isEmpty> methods.


public interface List<E> extends Collection<E>
{
  public E get(int index);
}

   




