package date;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date(){
		day = 0;
		month = 0;
		year = 0;
	}
	
	public Date(int mo, int da, int yr){
		day = da;
		month = mo;
		year = yr;
	}
	
	public int month(){
		int getMonth = month;
		return getMonth;
	}
	
	public int day(){
		int getDay = day;
		return getDay;
	}
	
	public int year(){
		int getYear = year;
		return getYear;
	}
	
	public String toString(){
		return "日期为：" + year() + "年" + month() + "月" + day() + "日";
	}
}