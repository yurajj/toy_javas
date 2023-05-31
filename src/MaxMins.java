import java.util.Scanner;

public class MaxMins {
 
    public static void main(String[] args) {
        try {

            Scanner num = new Scanner(System.in) ;

            int a = num.nextInt() ;
            int b = num.nextInt() ;

            System.out.println("Min 값은 : " + Math.min(a, b) + "입니다.");

            
            num.close(); 

        } catch(Exception e) {
            // TODO ~
        }
        // return 0;
    } 
}
