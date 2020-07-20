public class Test1044
{
	public static void main(String args[])
	{
		Student tom = new Student(12);
		tom.showData();
	}
}


class Person
{
	public int age;

	public Person()
	{
		System.out.println("Person Parameter Constructor");
		age = 17;
	}

	public int getAge()   	{ return age; }
}


class Student extends Person
{
	public int grade;

	public Student(int g)
	{
		grade = g;
		System.out.println("Student Parameter Constructor");
	}

	public int getGrade()   	{ return grade; }

	public void showData()
	{
		System.out.println("Student's Grade is " + grade);
		System.out.println("Student's Age is   " + age);
	}
}



