public class MFDriver {
    public static main (String[] args) {
	int[][] matrix = new MatrixFinder int[][];

	for (int matrix = 1; matrix <= 50; matrix ++) {
	    matrix.populate();
	    System.out.println("Matrix#" + matrix);
	    for (int trial = 1; trial <= 20; trial ++) {
		System.out.prinln("Trial " + trial + ": " + eTime(matrix));
	    }
	}
    }
}
