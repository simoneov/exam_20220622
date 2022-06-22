
/*
  Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
  A: {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  RESULT: 36
 */
public class SumMatrixValues {

    public static void main(String[] args) {
        int[][] intMatrix = {{2, 3, 4}, {1, 2, 3}, {5, 5, 5}};

        sumMatrix(intMatrix);

    }

    private static void sumMatrix(int[][] intMatrix) {
        int sum = 0;

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                sum += intMatrix[i][j];
            }
        }
        System.out.println("The sum of your matrix is " + sum);
    }

}