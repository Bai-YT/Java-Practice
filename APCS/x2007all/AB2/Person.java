public class Person
{
  private String name;

  public Person(String nm)
  {
    name = nm;
  }
  public boolean equals (Object other)
  {
    return name.equals(other);
  }

  public String getName()
  {
    return name;
  }

  public int hashCode()
  {
    return name.hashCode();
  }

  public String toString()
  {
    return name;
  }
}
