public class Pair implements Comparable
{
  private Person person1;
  private Person person2;

  /** @param p1 the first Person of the Pair
   *  @param p2 the second Person of the Pair
   */
  public Pair(Person p1, Person p2)
  {
    person1 = p1;
    person2 = p2;
  }

  /** @return first Person of this Pair
   */
  public Person getPerson1()
  {
    return person1;
  }

  /** @return second Person of this Pair
   */
  public Person getPerson2()
  {
    return person2;
  }


  /** @param other the object to be compared to this Pair
   *  Precondition: other is a Pair object
   *  @return the result of the comparison of the compatibility scores of this Pair and other
   */
  public int compareTo(Object other)
  {
    Pair otherPair = (Pair)other;
    return getPerson1().getName().compareTo(otherPair.getPerson1().getName()) +
              getPerson2().getName().compareTo(otherPair.getPerson2().getName());
  }

  public String toString()
  {
    return "(" + person1 + "/" + person2 + ")";
  }
}
