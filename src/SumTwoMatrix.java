
/*
  Given two matrix of ints prints on standard output the sum of both matrix
  A: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  B: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  RESULT:
  {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  Result matrix must be printed and formatted as previously shown
 */
public class SumTwoMatrix {

    public static void main(String[] args) {
        int[][] intMatrix = {{2, 3, 4}, {1, 2, 3}, {5, 5, 5}};
        int[][] intMatrix2 = {{2, 2}, {2, 2}, {2, 2, 2}};

        System.out.println("This is the sum of your two matrixes: "
                + (sumMatrix(intMatrix) + sumMatrix(intMatrix2)));

    }


    private static int sumMatrix(int[][] intMatrix) {
        int sum = 0;

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                sum += intMatrix[i][j];
            }
        }
        return sum;
    }


}