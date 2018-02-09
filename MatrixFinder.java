// Fun Tacos -- Maxwell Vale, Frank Chen, Tania Cao
// APCS2 pd2
// HW03 -- I Am Still Searching
// 2018/02/01

/* ****************************
 * MatrixFinder locate method
 * Given a matrix, x, of dimensions n*n and the target
 * Begin at the starting position, (0,n-1)
 * Enter while loop
 * As long as the row number and the column number are within the appropriate index
 * compare the current position to the target number:
 *    - If current number > target, you move down to the next number (aka row++;)
 *    - Otherwise current number < target, you move left to the next number (aka col--;)
 *    - If it isn't > or <, then the current number must be equal to target. Return the current index (row, col)
 * If at any point the index for row or column gets out of the range of the matrix,
 * the while loop ends and (-1,-1) is returned, meaning that the target is not in the matrix.
****************************** */

public class MatrixFinder {

	// Locate Method
	public static String locate (int[][] x, int target) {

		int row = 0;
		int col = x[0].length - 1;

		while (col >= 0 && row < x.length) {
			if (target > x[row][col]) {
				row ++;
			}
			else if (target < x[row][col]) {
				col --;
			}
			else {
				return target + " found at: (" + row + "," + col + ")";
			}
		}
		return target + " found at: (-1,-1)";
	}
	
	// Populate Method
	public static void populate (int[][] array){
		int count = 1;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				array[i][j] = count;
				count += 1;
			}
		}
    }

	// Main Method
	public static void main (String[] args) {

		System.out.println();
		
		int x = 200;
		long totalTime = 0;
		
		for (int n = 0; n < 20; n++) { // 20 Matrices
			
			long averageTime = 0;
			int[][] test = new int[x][x];
			populate(test);
				
			for (int i = 0; i < 50; i++) { // 50 Trials	
			
				long startTime = System.nanoTime();
				locate(test, test.length);
				long endTime = System.nanoTime();
				averageTime += (endTime - startTime);	
				
			}
			
			System.out.println(x + " * " + x + " Matrix: " + averageTime / 50 + "\n");
			x += 200;
			totalTime += (averageTime / 50);
		}
		
		System.out.println("Overall Average: " + totalTime / 20);
		
	}	

}
