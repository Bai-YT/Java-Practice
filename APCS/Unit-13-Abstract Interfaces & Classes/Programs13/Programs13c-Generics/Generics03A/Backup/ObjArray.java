// Generics03A
// This <ObjArray> class is declared as a "generic" class.
// "Class Parameter" <E> takes on the value of the data type 
// when a new <ObjArray> object is instantiated.


public class ObjArray<E>
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

	public void add(E obj)
	{
		array[size] = obj;
		size++;
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

	public void set(int index, E obj)
	{
		array[index] = obj;
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



