import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class i_f {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("ENTER WAIST SIZE");
        double size = s.nextDouble();

        if(size<5.5){
            System.out.println("SMALL");
        }
        else if(size<5.75){
            System.out.println("MEDIUM");
        }
        else{
            System.out.println("LARGE");
        }


    }
}
