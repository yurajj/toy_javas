import java.util.Scanner;
public class MaxMins {
    public static void main(String[] args) {
        //상아 : max 

        try {
        Scanner myObj = new Scanner (System.in); // 스캐너 사용
        // int first = myObj.nextInt();
        // int second = myObj.nextInt();
//         System.out.print ("Max: "+ Math.max(first, second));
        
//         }
        
//         // return 0 ;
        
//     }

// public class MaxMins {
 
//     public static void main(String[] args) {
//         try {

            // Scanner num = new Scanner(System.in) ;

            int a = myObj.nextInt() ; // 값 1 입력 받기
            int b = myObj.nextInt() ; // 값 2 입력 받기

            System.out.println ("Max : "+ Math.max(a, b)); // 최대값 출력하기 
            System.out.println("Min 값은 : " + Math.min(a, b) + "입니다."); // 최솟값 출력하기

            
            myObj.close();  // 스캐너 닫기

        } catch(Exception e) {
          // TODO ~
        }
        // return 0;
    } 
}

