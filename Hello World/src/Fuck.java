
public class Fuck implements HelloWorld{
	
	private int t;
	private String hw = "Fuck AP Computer Science Exam ";
	private String fuck = "";
	
	public Fuck(int times){
		t = times;
	}
	
	public String toString(){
		for(int i = 1; i <= t; i++)
			{
			if(i == 1)
				fuck += hw + "once \n";
			else if (i == 2)
				fuck += hw + "twice \n";
			else
				fuck += hw + i + " times \n";
			}
		return fuck;
	}
}	
