
public class DiverseArray {
	
	public static int arraySum(int[] arr){
		int sum = arr[0];
		for(int a = 1; a < arr.length; a++)
			sum += arr[a];
		return sum;
	}
	
	public static int[] rowsums(int[][] arr){
		int SumArr[] = new int [arr.length ];
		int pos=0;
		for(int myarr[]:arr){
			SumArr[pos++]= arraySum(myarr);
		}
		return SumArr;
	}
	
	public static boolean isDiverse(int[][] arr){
		int myarr[]= rowsums(arr);
		for(int b = 0; b < myarr.length; b++){
			for(int a = 1; a < myarr.length - b; a++){
				if(myarr[0] == myarr[0 + a])
					return false;
			}
		}
		return true;
	}
	
	public static void printMe(int[][] arr){
		for(int tarr[] : arr)
			{ for (int v : tarr)
				{System.out.print(v + " ");}
			System.out.println(); }	
	}
	
	public static void printMe(int[] arr){
		for (int v : arr)
			System.out.print(v + " ");	
	}
	public static void init(int [][] aa)
	{
		for(int a = 0; a < aa.length; a++)
			for(int b = 0; b < aa[0].length; b++)
				aa[a][b] = (int)(Math.random() * 10);
	}
	
	public static void main(String args[]){
		int row = 3;
		int col = 3;
		int arr1[][] = new int [row][col];
		int arr2[][] = new int [row][col];
		init(arr1);
		printMe(arr1);
		System.out.println(); 
		if(isDiverse(arr1))
			System.out.println("This is Diverse"); 
			else
				System.out.println("This is nonDiverse"); 	
		init(arr2);
		System.out.println(); 
		printMe(arr2);
		System.out.println();
		if(isDiverse(arr2))
		System.out.println("This is Diverse"); 
		else
			System.out.println("This is nonDiverse"); 	
		
		
	}
}

