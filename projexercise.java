import java.util.Scanner;

public class projexercise {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of physics :");
        int physics = sc.nextInt();

        System.out.println("Enter your marks of mathematics :");
        int mathematics = sc.nextInt();

        System.out.println("Enter your marks of chemistry :");
        int chemistry = sc.nextInt();

        System.out.println("Enter your marks of english:");
        int english = sc.nextInt();

        System.out.println("Enter your marks of computer :");
        int computer = sc.nextInt();

        float percentage =  ((physics + mathematics + chemistry + english + computer)/500.0f)*100;

        System.out.println("percentage : " + percentage);
        
    }
}
