import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] letter = {"AA","VV","II","PP","WW"};

        for(int i =0;i<5;i++) {
            System.out.println(letter[i]);
        }
        System.out.println();
        for (int i =0; i< letter.length; i++){
            System.out.println(letter[i]);
        }
        System.out.println();
        int o=0;
        while (o < letter.length){
            System.out.println(letter[o]);
            o++;
        }
        System.out.println();
        //System.out.println("Array Length is "+letter.length);//count from 1
        //System.out.println(Arrays.toString(letter));//show input array

        int num[] = new int[5];
        System.out.println(num.length);
        num[0] = 30;
        num[4] = 5;
        System.out.println("ARRAY IS "+num[3]);

        String name[] = new String[3];
        name[1] = "Thet Htet";
        name[2] = "FREDA";
        System.out.println("ARRAY NAME IS "+ name[1]);
    }
}
