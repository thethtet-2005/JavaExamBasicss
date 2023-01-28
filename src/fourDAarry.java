import java.util.Arrays;

public class fourDAarry {

        public static void main(String[] args) {


            int[][][][] arr = new int[1][2][3][4];
            System.out.println(arr.length);
            System.out.println(arr[0].length);
            System.out.println(arr[0][0].length);
            System.out.println(arr[0][0][0].length);


            System.out.println(Arrays.deepToString(arr));
            int num = 10;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                        for (int l = 0; l < arr[i][j][k].length; l++) {
                            num += 10;
                            System.out.println(arr[i][j][k][l] = num);
                        }

                    }

                }
            }
        }
    }

