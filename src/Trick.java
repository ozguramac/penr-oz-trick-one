import java.util.Arrays;

/**
 * Created by Özgür V. Amaç on 11/18/17.
 */
public class Trick {

    public static void main(String... args) {
        final int[][] orig = {
                 {0,0,0,0,0}
                ,{0,0,0,0,0}
                ,{0,0,1,0,0}
                ,{0,1,0,1,0}
                ,{0,0,0,0,0}
        };
        final int[][] expected = {
                 {0,0,0,0,0}
                ,{0,0,1,0,0}
                ,{0,1,1,1,0}
                ,{1,1,1,1,1}
                ,{0,1,0,1,0}
        };

        System.out.println("Before:");
        for (int[] v : orig) {
            System.out.println(Arrays.toString(v));
        }

        new Trick().transform(orig);

        System.out.println("After:");
        for (int[] v : orig) {
            System.out.println(Arrays.toString(v));
        }

        boolean correct = true;
        for (int i=orig.length-1; i >= 0; i--) {
            if (false == Arrays.equals(orig[i], expected[i])) {
                correct = false;
                break;
            }
        }
        System.out.println("Correct="+correct);
    }

    private void transform(final int[][] matrix) {
        final int n = matrix.length;
        for (int i=0; i < n; i++) {
            final int m = matrix[i].length;
            for (int j=0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    if (i > 0) { //North
                        matrix[i - 1][j] = -1;
                    }
                    if (i < n - 1) { //South
                        matrix[i + 1][j] = -1;
                    }
                    if (j > 0) { //West
                        matrix[i][j - 1] = -1;
                    }
                    if (j < m - 1) { //East
                        matrix[i][j + 1] = -1;
                    }
                }
            }
        }
        for (int i=0; i < n; i++) {
            final int m = matrix[i].length;
            for (int j=0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 1;
                }
            }
        }
    }
}
