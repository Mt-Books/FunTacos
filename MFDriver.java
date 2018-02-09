public class MFDriver {

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

  public static void main (String[] args) {

    System.out.println();

    int numMatrices = 100;

		int x = 100;
		long totalTime = 0;

		for (int n = 0; n < numMatrices; n++) { // 100 Matrices

			long averageTime = 0;
			int[][] test = new int[x][x];
			MatrixFinder.populate(test);

			for (int i = 0; i < 50; i++) { // 50 Trials

				if (i != 0) {
					long startTime = System.nanoTime();
					MatrixFinder.locate(test, test[test.length - 1][0]);
					long endTime = System.nanoTime();
					averageTime += (endTime - startTime);
				}

			}

			System.out.println(x + ", " + averageTime / 49 + "\n");
			x += 100;
			totalTime += (averageTime / 49);
		}

		System.out.println("Overall Average: " + totalTime / numMatrices);

  }
}
