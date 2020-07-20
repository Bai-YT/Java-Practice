public class Test1042
{
	public static void main(String args[])
	{
		Student tom = new Student();
		System.out.println("tom's age is    " + tom.getAge());
		System.out.println("tom's grade is " + tom.getGrade());
	}
}

class Person
{
	private int age;

	public int getAge()
	{
		return age;
	}
}

class Student // extends Person
{
	private int grade;

	public int getGrade()
	{
		return grade;
	}
}


