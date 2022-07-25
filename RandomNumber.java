public class Main {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;
        int random = min + (int) (Math.random() * (max - min + 1));
        System.out.println(random);

        //Please find factorial from random number in range 5-10;
        //5 1*2*3*4*5
        //8 1*2*3*4*5*6*7*8
        //6 1*2*3*4*5*6

        int factorial = 1;
        for (int i = 1; i <= random; i++) {
            factorial = factorial * i;
            System.out.println(String.format("num %d n! %d", i, factorial));
        }


    }
}
