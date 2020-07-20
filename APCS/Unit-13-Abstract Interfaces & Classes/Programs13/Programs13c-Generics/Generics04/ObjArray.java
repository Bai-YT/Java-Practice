// Generics04
// The <ObjArray> class implements the <List> interface.


public class ObjArray<E> implements List<E>
{
	private Object[] array;
	private int size;

	public ObjArray()
	{
		array = new Object[10000];
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public boolean add(E obj)
	{
		array[size] = obj;
		size++;
      return true;
	}

   public void add(int index, E obj)
	{
      size++;
		for (int k = size-1; k > index; k--)
			array[k] = array[k-1];
		array[index] = obj;
	}

	public E get(int index)
	{
		return (E) array[index];
	}

	public E set(int index, E obj)
	{
      E temp = (E) array[index];
		array[index] = obj;
      return temp;
	}

	public E remove(int index)
	{
		E temp = (E) array[index];
		for (int k = index; k < size-1; k++)
			array[k] = array[k+1];
		size--;
		return (E) temp;
	}

	public String toString()
	{
      String temp = "[";
		for (int k = 0; k < size-1; k++)
			temp = temp + array[k] + ", ";
      temp = temp + array[size-1] + "]" + "\n";
      return temp;
	}
}

