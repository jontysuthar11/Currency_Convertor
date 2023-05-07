import java.util.Scanner;

public class Java_05_Taking_input {
    public static void main (String args[]){
        System.out.println("It works");
        Scanner sc = new Scanner(System.in);
                // (System.in ) = isliye liya kyu ki keyboard se input lenge
                // System.out.println("Enter the number 1");
                // int a = sc.nextInt();
                // System.out.println("Enter the number 2");
                // int b = sc.nextInt();
                // int sum = a+b;
                // System.out.println("The sum of two number is "+sum);

                // --------****---->>>
                // boolean b1 = sc.hasNextInt();
                //System.out.println(b1);  // use where we have to check validity of expression;

                // String str = sc.next();

                // -----*****---->>>
                String str = sc.nextLine();
                System.out.println(str);
                // it takes only first word after gap;

    }
}
