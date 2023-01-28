public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 50;
        int num3 = num2;
        int num4 = 30;
        int num5 = 10;

        System.out.println("Number 3 is = " + num3);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println();
        System.out.println(num4++);
        System.out.println(num4);

        System.out.println();
        System.out.println(num1--);
        System.out.println(num1);

        System.out.println();
        System.out.println(num2);
        System.out.println(num2++);
        System.out.println(num2);
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println();
        System.out.println(num5);
        System.out.println(num5--);
        System.out.println(num5);
        System.out.println(--num5);
        System.out.println(num5);
        System.out.println(--num5);
        System.out.println(num5 +"\n");

        int n1 = 10;
        int n2 = 30;
        int n3 = 50;
        int n4 = 20;

        System.out.println("Assignment opreator");

        n1 += 10;
        n2 *= 2;
        n3 -= 20;
        n4 /= 2;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        n4 /= n1;
        System.out.println(n4+"\n");

        int a1 = 10;
        int a2 = 20;
        int a3 = 30;
        int a4 = 10;
        System.out.println("Relational opreators\n");
        if(a1==a2){
            System.out.println("THEY ARE EQUAL");
        }
        else{
            System.out.println("THEY ARE NOT EQUAL");
        }

        if (a2 > a1){
            System.out.println("A2 IS GREATER THAN A1");
        }
        else{
            System.out.println("A2 IS LESS THAN A1");
        }

        if(a1 <= a4 ){
            System.out.println("A1 IS LESS THAN OR EQUAL A4");
        }
        else{
            System.out.println("A1 IS GREATER THAN A4");
        }

        if (a3 < a1){
            System.out.println("A3 IS LESS THAN A1");
        }
        else{
            System.out.println("A1 IS LESS THAN A3\n");
        }






    }
}
