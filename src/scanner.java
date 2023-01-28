import java.util.Scanner;
public class scanner {


    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);

            System.out.println("ENTER YOUR NAME");
            String name = s.nextLine();

            System.out.println("ENTER YOUR AGE");
            int age = s.nextInt();

            System.out.println("** NAME - "+ name);
            System.out.println("** AGE  - "+ age);



    }
}
