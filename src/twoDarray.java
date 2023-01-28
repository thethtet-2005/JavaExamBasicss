import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] num = {
            {10,20,30,80},
            {40,50,60},
            {100,200,400}
        };
        System.out.println(num[0][3]);
        System.out.println(num[2][0]);
        System.out.println("Array in twoDa " + Arrays.deepToString(num));
        System.out.println();

        for (int i =0 ;i < num.length; i++){
            for (int k = 0 ; k < num[i].length ; k++){
                System.out.println(num[i][k]);
            }
        }
        System.out.println();

        int[][] no = new int[3][3] ;

        no[0][1] = 30;
        no[2][2] = 100;
        no[0][0] = 7;
        no[1][1] = 5000;

        System.out.println(no[0][1]);
        System.out.println("Two D ARRay "+Arrays.deepToString(no));
        System.out.println();

        int[][][] i = new int[3][3][3] ;

        i[0][1][0] = 300;
        i[1][0][0] = 4;

        System.out.println(i[0][1][0]);
        System.out.println(i.length);
        System.out.println("Three D ARRay "+Arrays.deepToString(i));
        System.out.println();

        int[][][] hello = {{
                {10,20,30},{2,4,5}},
                {{40,50,60},{3,7,9}},
                {{100,200,400},{8,6,21}}
        };
        System.out.println(hello[0][1][2]);
        System.out.println("Array in three33Da " + Arrays.deepToString(hello));
        System.out.println();

        int[] number = {1,2,3,4,5};
        int[] numberclone = number.clone();
        System.out.println("ARRAY CLONE " + Arrays.toString(numberclone));
        System.out.println(number.equals(numberclone));


    }
}
