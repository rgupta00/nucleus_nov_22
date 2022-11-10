
public class IdentityMatix {
	
	public static void main(String[] args) {
		//how to create array in java
		int x[][]= {{1,0,0},{0,1,0},{0,0,1}};
		boolean isIdetity=true;
		
		isIdetity = checkForIdentityMatrix(x, isIdetity);
		if(isIdetity)
			System.out.println("yes");
		else
			System.out.println("no");
		print2D(x);
		
	}


	static boolean checkForIdentityMatrix(int[][] x, boolean isIdetity) {
		for(int i=0;i<x.length; i++) {
			for(int j=0;j<x[i].length; j++) {
				if(i==j) {
					if(x[i][j]!=1) {
						isIdetity=false;
						break;
					}
				}else {
					if(x[i][j]!=0) {
						isIdetity=false;
						break;
					}
				}
			}
		}
		return isIdetity;
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
