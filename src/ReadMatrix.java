import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Given a string as standard input parse the string into a matrix

  args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"

  RESULT: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }
 */
public class ReadMatrix {

    public static void main(String[] args) {

        String matrixSlot = "\\{(\\d+),(\\d+),(\\d+)\\}";
        Pattern pattern = Pattern.compile("\\{" + matrixSlot + "," + matrixSlot + "," + matrixSlot + "\\}");
        Matcher matcher = pattern.matcher(args[0]);

        matcher.matches();

        int[][] intMatrix = new int[3][3];

        int counter = 1;

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                intMatrix[i][j] = Integer.parseInt(matcher.group(counter));
                counter++;
            }
        }


        System.out.println(Arrays.deepToString(intMatrix));


    }

}