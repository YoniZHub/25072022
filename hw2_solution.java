import java.util.Scanner;

public class hw2_solution {
    public static void main(String[] args) {

        //seif_1;
        /*
        Scanner s = new Scanner(System.in);

       for (int i =0; i < 10; i++){
           int x = s.nextInt();
           if (x>=0)
               System.out.println(x);

       }
       */

        // seif_2
        /*
        Scanner s = new Scanner(System.in);

        int sumP = 0;
        int sumN = 0;
        for (int i =0; i < 10; i++) {
            int x = s.nextInt();
            if (x >= 0){
                sumP = sumP + x;

            }

                else if (x <0)
                    sumN = sumN + x;
            }

        System.out.println(sumP);
        System.out.println(sumN);

         */

        //seif_3

        /*
        Scanner s = new Scanner(System.in);

        System.out.println( "enter num" );
        int num = s.nextInt();
        System.out.println( "enter power num");
        int power = s.nextInt();
        int result = 1;


        for(int i = 1 ; i <= power ; i ++){
            result *= num;

        }

        System.out.println(result);

         */

        //seif_4
        /*

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        int y = 0;
        while (x != 0){
            y *= 10;
            y += x%10;
           // System.out.print(x%10);
            x = x/10;
        }
        System.out.println(y);
    }
*/


        //seif_5;

        /*
        Scanner s = new Scanner(System.in);

        int evenSum = 0;
        int oddMult = 1;

        for (int i = 1; i <= 10; i++){

            int num = s.nextInt();
            if(i % 2 == 0){
                evenSum = num + evenSum;
            }
            else{
                oddMult = num * oddMult;
            }

        }

        System.out.println(evenSum);
        System.out.println(oddMult);


         */

        //seif_6

        Scanner s = new Scanner(System.in);

        float num = s.nextFloat();
        float result = 0;

        for (int i = 1; i <= num; i ++){
            result += 1.0 / i;
        }
        System.out.println(result);

    }
    }

