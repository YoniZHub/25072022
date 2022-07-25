import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //print from 1 to 10
//        for (int i = 1; i <=10; i++) {
//            System.out.println(i);
//        }

//        //print from 1000 to 900
//        for (int i = 1000; (i >=900) ; i--) {
//            System.out.println(i);
//        }


        //print numbers from a to b
//        Scanner s = new Scanner(System.in);
//        System.out.println("Please enter a");
//        int a = s.nextInt();
//        System.out.println("Please enter b");
//        int b = s.nextInt();
//
//        for (int i = a; i <= b; i++) {
//            System.out.println(i);
//        }


//        print numbers from 1 to 100 which divide by 7 without module

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }


        System.out.println("Good bye");


    }
}
