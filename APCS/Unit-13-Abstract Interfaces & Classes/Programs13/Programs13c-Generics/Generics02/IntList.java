// Generics02
// This <IntList> interface strictly specializes with methods to 
// process <int> variables only.


public interface IntList
{
	public int size();

	public void add(int nbr);

	public void add(int index, int nbr);

	public int get(int index);

	public void set(int index, int nbr);

	public int remove(int index);
}

