
public class Demo2DArray {
	
	public static void main(String[] args) {
		//how to create array in java
		int x[][]=new int[4][5];
	
		
		
		print2DWithoutEnhanceForLoop(x);
		
	}
	
	static void print2DWithoutEnhanceForLoop(int[][] x) {
		for(int i=0;i<x.length; i++) {
			for(int j=0; j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	static void print2D(int[][] x) {
		for(int temp[]:x) {
			for(int temp2: temp) {
				System.out.print(temp2+" ");
			}
			System.out.println();
		}
	}

}
