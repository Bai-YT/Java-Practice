// Generics01
// This is how the <List> interface appears on the College Board


interface List<E>
{
   public int Size();
   public boolean add(E obj);
   public void add(int index, E obj);
   public E get(int index);
   public E set(int index, E obj);
   public E remove(int index);
}

