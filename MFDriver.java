public class MFDriver {
    public static void main (String[] args) {
	int numMatrices = 100;
	int size = 100;
	long totalTime = 0;

	for (int n = 0; n < numMatrices; n++) { // 100 Matrices
	    long averageTime = 0;
	    int[][] test = new int[size][size];
	    MatrixFinder.populate(test);
	    for (int i = 0; i <= 50; i++) { // 50 Trials
	        if (i != 0) {
		    long startTime = System.nanoTime();
		    MatrixFinder.locate(test, test[test.length - 1][0]);
		    long endTime = System.nanoTime();
		    averageTime += (endTime - startTime);
		}

	    }

	    System.out.println(size + "--> " + averageTime / 50 + "\n");
	    totalTime += (averageTime / 50);
	    size += 100;
	}
	
	System.out.println("Overall Average: " + totalTime / numMatrices);
    }
}
