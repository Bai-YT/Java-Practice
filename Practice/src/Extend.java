
public class Extend extends Practice {
	
	String str = "";
	
	public Extend(){
	}
	
	public Extend(int n){
		super(n);
	}
	
	public Extend(int n, String s){
		super(n);
		str = s;
	}
	
	public String getStr(){
		return str;
	}
	
	public String toString(){
		return "extended " + super.getI() + " " + str;
	}
}
