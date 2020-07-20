import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PairMatcher
{
  private Map<Person, PriorityQueue<Pair>> personMap;

  /*** Part (a) ***/

  /** Initializes and fills personMap so that each Person in personList is a key,
   *  and the value associated with each key k is a PriorityQueue of Pair objects
   *  pairing k with all other Persons in  personList
   *  @param personList a nonempty list of Person objects
   */
  public PairMatcher(List<Person> personList)
  {
    personMap = new HashMap<Person, PriorityQueue<Pair>>();
    for (Person p : personList)
    {
      PriorityQueue<Pair> q = new PriorityQueue<Pair>();
      for (Person p2 : personList)
        if (p2 != p)
          q.add(new Pair(p, p2));
      personMap.put(p, q);
    }
  }

  /*** Part (b) ***/

  /** @param p the Person to be matched
   *  @param num the number of Person objects to remove
   *         Precondition: if p is in personMap, then num is > 0 and less than or equal to
   *                       the number of pairs in the priority queue associated with p
   *  @return an array of the num removed Person objects;
   *          null if p is not in  personMap
   */
  public Person[] removeNumMatches(Person p, int num)
  {
    if (!personMap.containsKey(p))
      return null;
    PriorityQueue<Pair> q = personMap.get(p);

    Person[] arr = new Person[num];

    for (int i = 0; i < num; i++)
      arr[i] = q.remove().getPerson2();

    return arr;
  }

  /****************/

  public String toString()
  {
    return personMap.toString();
  }
}
