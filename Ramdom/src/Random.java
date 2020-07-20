
public class Random {
	
	private int i;
	private int r;
	
	public Random (){}
	
	public Random (int n){
		i = n;
	}
	
	public void RandomNum(){
		r = (int)(Math.random() * i + 0.5);
		System.out.println(r);
	}
	
}