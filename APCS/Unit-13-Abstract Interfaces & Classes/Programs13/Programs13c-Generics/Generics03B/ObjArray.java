// Generics03B
// This <ObjArray> class is declared as a "generic" class.
// The is almost identical to the Generics03A file.
// All the methods do the same process.
// The only difference is that <E> is now <Aardvark>.


public class ObjArray<Aardvark>
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

	public void add(Aardvark obj)
	{
		array[size] = obj;
		size++;
	}

	public void add(int index, Aardvark obj)
	{
      size++;
		for (int k = size-1; k > index; k--)
			array[k] = array[k-1];
		array[index] = obj;
	}
   
	public Aardvark get(int index)
	{
		return (Aardvark) array[index];
	}

	public void set(int index, Aardvark obj)
	{
		array[index] = obj;
	}

	public Aardvark remove(int index)
	{
		Aardvark temp = (Aardvark) array[index];
		for (int k = index; k < size-1; k++)
			array[k] = array[k+1];
		size--;
		return (Aardvark) temp;
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



