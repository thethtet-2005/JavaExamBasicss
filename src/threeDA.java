

public class threeDA {
    public static void main(String[] args) {
        int[][][] num = {{
                {10,20,30},{2,4,5}},
                {{40,50,60},{3,7,9}},
                {{100,200,400},{8,6,21}}
        };



        for (int i =0 ;i < 10; i++){
            for (int k = 0 ; k < 10 ; k++){
                for(int c = 0 ; c < 10 ; c++){
                    System.out.println(num[i][k][c]);

                }


            }
        }
    }}