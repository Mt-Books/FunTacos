## Matrix Finder
Created by: Fun Tacos (Tania Cao, Frank Chen, Maxwell Vale)

### Hypothesis
The execution-time to find the value of the worst case scenario increases as the size of the matrix increases.

### Background
In the matrix, the smallest number is located at the top left. The values of the numbers to the right and bottom as each number increases. The worst case scenario in all matrices, no matter the size, would be located at the bottom left of the matrix.

### Experiment
The algorithm we've developed would execute the following...
* Create a matrix of size n x n, where n starts at 100.
* Populate the matrix and run 50 trials of the locate method.
* Record the time per trial and find the average of all 50 trials.
* As a result we're given the average execution-time of a n x n matrix.
* Repeat until 100 matrices were created.

### Results
![](MatrixFinder.PNG)

### Conclusion
Our hypothesis is partially true. According to he data we've gathered, the execution-time increases overall, but between two adjacent matrices, the execution-time can go either way. 
