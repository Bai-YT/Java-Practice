import java.util.LinkedList;
import java.util.Arrays;

public class TestPairMatcher
{
  public static void main(String[] args)
  {
    LinkedList<Person> personList = new LinkedList<Person>();
    Person jamie = new Person("Jamie"); personList.add(jamie);
    Person chris = new Person("Chris"); personList.add(chris);
    Person pat = new Person("Pat"); personList.add(pat);
    Person terry = new Person("Terry"); personList.add(terry);

    PairMatcher matcher = new PairMatcher(personList);
    System.out.println(matcher);

    Person[] people;
    people = matcher.removeNumMatches(jamie, 1);
    System.out.println(Arrays.asList(people));
    people = matcher.removeNumMatches(chris, 2);
    System.out.println(Arrays.asList(people));
    people = matcher.removeNumMatches(pat, 3);
    System.out.println(Arrays.asList(people));
    System.out.println(matcher);
  }
}
