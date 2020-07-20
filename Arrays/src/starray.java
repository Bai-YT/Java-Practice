
public class starray {

	public static void main(String[] args) {
		//int prices[]=new int[20];  //1 dimension array
		//int discountedprice[]=new int[20];
		int grid[][] = new int[4][3];
		//int trial[]={12,23,45,65};
		for(int r=0;r < grid.length;r++){
			for (int c = 0;c<grid[0].length;c++)
				grid[r][c]=(int) (Math.random()*50);
		}
		for(int r=0;r<grid.length;r++)
			{for (int c = 0;c<grid[0].length;c++){
				System.out.print(grid[r][c]+ " ");
		}
		System.out.println();}
		System.out.println("Minimum value in Grid is " + findmin(grid));
}
	public static int findmin(int grd[][]){
		int min = grd[0][0];
		for(int i = 0; i < grd.length; i++){
			for(int k = 1; k < grd[0].length; k++){
				if(grd[i][k] < min)
					min = grd[i][k];
			}
		}
			return min;
}
}
