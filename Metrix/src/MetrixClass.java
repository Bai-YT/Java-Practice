
public class MetrixClass {
	
	int l = 3;
	int mx[][] = new int[l][l];
	
	public MetrixClass(){
		System.out.println(l);
		for(int r = 0; r < l; r++){
			for (int c = 0; c < l; c++){
				mx[r][c] = (int) (Math.random() * 20 + 1);
			}
		}
		System.out.println("Metrix Made");
	}
	
	public void PrintMe(){
		for(int r = 0; r < l; r++){
			for (int c = 0;c < l; c++)
			System.out.print(mx[r][c]+ " ");
		System.out.println();
		}
	}
	
	public void RotateR(){
		int mx2[][] = new int[l][l];
		for(int r = 0;r < l;r++){
			for (int c = 0; c < l; c++)
				mx2[r][c]=mx[r][c];
		}
		//mx[0][l-1] = mx2[0][0];
		//mx[1][l-1] = mx2[0][1];
		/* 
		for (int c = 0; c < l; c++)
			mx[c][l-1] = mx2[0][c];
		for (int c = 0; c < l; c++)
			mx[c][l-2] = mx2[1][c];
		for (int c = 0; c < l; c++)
			mx[c][l-3] = mx2[2][c]; 
		*/
		for (int i = 0; i < l; i++){
			for (int c = 0; c < l; c++)
				mx[c][l-1-i] = mx2[i][c];
		}
		System.out.println("Turned Right");
	}	
	
	public void RotateL(){
		int mx2[][] = new int[l][l];
		for (int i = 0; i < l; i++){
			for (int c = 0; c < l; c++)
				mx2[c][l-1-i] = mx[i][c];
		}
		for(int r = 0;r < l;r++){
			for (int c = 0; c < l; c++)
				mx[r][c]=mx2[r][c];
		}
		System.out.println("Turned Left");
	}
}
