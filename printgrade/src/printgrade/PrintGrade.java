package printgrade;

public class PrintGrade {

	public static void main(String[] args) {
		int scr = 190;
		PrintGrd(scr);
	}
	public static void PrintGrd(int score)
	{
		if(score > 100){
			System.out.print("Scores should be a number between 0 and 100.");
		}
		else if(score >=90){
			System.out.print("The grade is A.");
		}
		else if(score >= 80){
			System.out.print("The grade is B.");
		}
		else if(score >= 70){
			System.out.print("The grade is C.");
		}
		else if(score >= 60){
			System.out.print("The grade is D.");
		}
		else if(score >= 20){
			System.out.print("The grade is E.");
		}
		else{
			System.out.print("The grade is F.");
		}
	}
}
