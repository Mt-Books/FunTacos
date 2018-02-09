// Fun Tacos -- Maxwell Vale, Frank Chen, Tania Cao
// APCS2 pd2
// HW03 -- I Am Still Searching
// 2018/02/01

/* ****************************
 * MatrixFinder locate method
 * Given a matrix, x, of dimensions n*n and the target
 * Begin at the starting position, (0,n-1)
 * Enter while loop
 * As long as the row number and the column number are within the 
 * appropriate index, compare the current position to the target number:
 *    - If current number > target, you move down to the next number
 *      (aka row++;)
 *    - Otherwise current number < target, you move left to the next number 
 *      (aka col--;)
 *    - If it isn't > or <, then the current number must be equal to target.
 *      Return the current index (row, col)
 * If at any point the index for row or column gets out of the range of the
 * matrix, the while loop ends and (-1,-1) is returned, meaning that the
 * target is not in the matrix.
 ****************************** */

public class MatrixFinder {
    int[][] matrix;
    
    // overwrite default toString to display the matrix
    public static String toString() {
	String s = "";
	for (int r = 0; r < matrix.length; r++) {
	    for (int c = 0; j < matrix[0].length; c++) {
		s += matrix[r][c] + " ";
	    }
	}
	return s;
    }

    // locate() goes through the given array[][] (matrix) and searches for
    // the target. If found, it will return the indexes of the target. If
    // not, it returns (-1,-1).
    public static String locate (int[][] x,int target) {
	int row = 0;
	int col = x[0].length - 1;
	while (col >= 0 && row < x.length) {
	    if (target > x[row][col])
		row ++;
	    else if (target < x[row][col])
		col --;
	    else
		return target + " found at: (" + row + "," + col + ")";
	}
	return target + " found at: (-1,-1)";
    }

    // should we put the execution time function here?
    // eTime() runs the locate function on a given array[][] (matrix) and
    // return the amount of time needed to execute the function.
    public static long eTime(int[][] x) {
	long start = System.nanoTime();
	locate(x,x[x.length][x[0].length]);
	long end = System.nanoTime();
	return start - end;
    }
}
