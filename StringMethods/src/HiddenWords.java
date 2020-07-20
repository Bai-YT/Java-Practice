public class HiddenWords{
	
	String ans;
	
	public HiddenWords()
	{
		ans = "";
	}
	public HiddenWords(String a)
	{
		ans = a;
		System.out.println(ans);
	}
	
	public String getHint(String str){
		String b = "";
		for(int n = 0; n < 5; n++){
			if(str.substring(n, n + 1).equals(ans.substring(n, n + 1)))
				b += ans.substring(n, n + 1);
			else if(ChkLtr(str.substring(n, n + 1)) == 1)
				b += "+";
			else
				b += "*";
		}
		return b;
	}
	
	public int ChkLtr(String ipt){
		if(ans.indexOf(ipt) >= 0)
			return 1;
		else
			return 0;
	}
}
