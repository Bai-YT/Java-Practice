package project;

public class Car 
{
private String model;
private double price;
private int power;
private static int nuofcars=0;

public Car()
{
	model = "Blank"; price = 0; power=0; nuofcars+=1;
	System.out.println("Inside Car Empty constructor");
}
public Car(String md, double prc, int pw)
{
	model = md; price = prc; power=pw;
	System.out.println("Inside Car Parameterised constructor");
	nuofcars+=1;
}

public void changeinfo(String md, double prc, int pw)
{
	model = md; price = prc; power=pw;
}
public void howmanycars()
{
	System.out.println(nuofcars + " Car objects created");
}
public void copyspecs(Car tmp)
{
	this.model = tmp.model;
	this.price = tmp.price;
	this.power =tmp.power;
}
public String toString()
{
	return "Model: "+ model + " Price : "+ price + " Power : "+ power;
}
}

