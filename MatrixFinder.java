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

	// Main Method
	public static void main (String[] args) {

		System.out.println();

		int[][] test = { {1,2,5} , {3,4,6} , {7,8,9} };

		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[0].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println(locate(test, 5));
		System.out.println(locate(test, 7));
		System.out.println(locate(test, 4));
		System.out.println(locate(test, 42));
	}

}
