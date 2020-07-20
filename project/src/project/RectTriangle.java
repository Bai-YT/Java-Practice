package project;

public class RectTriangle extends Shapes {

	private double base;
	private double height;
	private double area;
	
	public RectTriangle(){
		super("Triangle");
		base = 0;
		height = 0;
		
		System.out.println("RectTriangle created");
	}
	public RectTriangle(double b, double h){
		super("Triangle");
		base = b;
		height = h;
		System.out.println("RectTriangle with param created");
	}		
	public void calcArea()
	{
		area = base * height / 2;
	}
	
	public String toString(){
		calcArea();
		return super.toString() + " The area is: " + area;
	}
}