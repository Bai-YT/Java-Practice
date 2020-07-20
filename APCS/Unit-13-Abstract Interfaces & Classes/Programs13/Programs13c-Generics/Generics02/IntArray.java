// Generics02
// The <IntArray> "concrete" class implements the
// <IntList> "abstract" interface.


public class IntArray implements IntList
{
	private int[] array;
	private int size;

	public IntArray()
	{
		array = new int[10000];
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public void add(int nbr)
	{
		array[size] = nbr;
		size++;
	}

	public void add(int index, int nbr)
	{
      size++;
		for (int k = size-1; k > index; k--)
			array[k] = array[k-1];
		array[index] = nbr;
	}

	public int get(int index)
	{
		return array[index];
	}

	public void set(int index, int nbr)
	{
		array[index] = nbr;
	}
   
   public int remove(int index)
	{
		int temp = array[index];
		for (int k = index; k < size-1; k++)
			array[k] = array[k+1];
		size--;
		return temp;
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



