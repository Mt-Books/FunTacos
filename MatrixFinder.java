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
    
    public MatrixFinder() {
	matrix = new int[1][1];
    }

    public MatrixFinder(int size) {
	matrix = new int[size][size];
	
    }
    
    // overwrite default toString to display the matrix
    public String toString() {
	String s = "";
	for (int r = 0; r < matrix.length; r++) {
	    for (int c = 0; c < matrix[0].length; c++) {
		s += matrix[r][c] + " ";
	    }
	}
	return s;
    }

    // populate() populates the given array[][] (matrix) with numbers
    // following the rules of the matrix:
    //     - smallest number is located in (0,0)
    //     - value of numbers to the right and bottom of (0,0) increases
    //     - largest number is located in the bottom right of the matrix
    public static void populate(int[][] matrix) {
	for (int r = 0; r < matrix.length; r ++) {
	    for (int c = 0; c < matrix[0].length; c ++) {
		int random = (int) (Math.random() * 9999) + 1;
		if (r == 0 && c == 0) {
		    matrix[0][0] = 0;
		}
		else {
		    if (r == 0) {
			matrix[r][c] = matrix[r][c-1] + random;
		    }
		    else {
			if (c == 0) {
			    matrix[r][0] = matrix[r-1][0] + random;
			}
			else {
			    int larger;
			    if (matrix[r-1][c] > matrix[r][c-1]) {
				larger = matrix[r-1][c];
			    }
			    else {
				larger = matrix[r][c-1];
			    }
			    matrix[r][c] = larger + random;
			}
		    }
		}
	    }
	}
    }
    
    // locate() goes through the given array[][] (matrix) and searches for
    // the target. If found, it will return the indexes of the target. If
    // not found, it returns (-1,-1).
    public static String locate (int[][] x,int target) {
	int row = 0;
	int col = x[0][x.length-1] - 1;
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

    // eTime() runs the locate function on a given array[][] (matrix) and
    // return the amount of time needed to execute the function.
    public static long eTime(int[][] x) {
	long start = System.nanoTime();
	locate(x,x[x.length][x[0].length]);
	long end = System.nanoTime();
	return start - end;
    }

    // For testing purposes --> this needs to be moved to driver and deleted from this file
    public static void main (String[] args) {
	MatrixFinder matrix = new MatrixFinder(5);
	System.out.println(matrix);	    
	populate(matrix); // not working
	System.out.println(matrix);
    }
}
