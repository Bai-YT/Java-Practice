
public abstract class Practice {
	
	double 妈的智障;
	int i = (int)妈的智障;
	
	public Practice(){
	}

	public Practice(int n){
		i = n;
	}
	
	public int getI(){
		return i;
	}
	
	public abstract String getStr();
	
	public String toString(){
		return "practice " + i;
	}
}
