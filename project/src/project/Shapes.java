package project;

public class Shapes {
	private String shapeType;
	
	public Shapes(){
		shapeType = " ";
		System.out.println("Shape created");
	}
	
	public Shapes(String st){
		shapeType = st;
		System.out.println("Shape with param created");
	}
	
	public String toString(){
		return "The shape is: " + shapeType;
	}
}
