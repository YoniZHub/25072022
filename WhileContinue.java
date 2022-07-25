import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float grades=0;
        float lessons=0;

        while (true) {
            System.out.println("Please enter grade");
            float grade = s.nextInt();
            if(grade == 1000){
                break;
            }
            if(grade < 0){
                continue;
            }
            grades+=grade;
            lessons++;
            System.out.println(grades);
            System.out.println(lessons);

        }
        System.out.println(grades/lessons);
        System.out.println("Bye");
    }
}
