import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Given two string as standard input parse them as matrix,
  Then sum both matrix
  And pretty print on stdout the result matrix
  Then print the sum of matrix result values
 */
public class MatrixCombined {

    public static void main(String[] args) {

        String matrixSlot = "\\{(\\d+),(\\d+),(\\d+)\\}";
        Pattern pattern = Pattern.compile("\\{" + matrixSlot + "," + matrixSlot + "," + matrixSlot + "\\}");
        Matcher matcher = pattern.matcher(args[0]);
        Matcher matcher2 = pattern.matcher(args[1]);


        matcher.matches();
        matcher2.matches();


        int[][] intMatrix = new int[3][3];
        int[][] intMatrix2 = new int[3][3];

        int counter = 1;

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                intMatrix[i][j] = Integer.parseInt(matcher.group(counter));
                counter++;
            }
        }

        int[][] intMatrixSum = new int[3][3];
        counter = 1;
        for (int i = 0; i < intMatrix2.length; i++) {
            for (int j = 0; j < intMatrix2[i].length; j++) {
                intMatrix2[i][j] = Integer.parseInt(matcher2.group(counter));
                intMatrixSum[i][j] = intMatrix[i][j] + intMatrix2[i][j];
                counter++;
            }
        }
        System.out.println("This is the matrix with the sum of the two matrixes "
                + Arrays.deepToString(intMatrixSum));
        System.out.println();
        sumMatrix(intMatrixSum);


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