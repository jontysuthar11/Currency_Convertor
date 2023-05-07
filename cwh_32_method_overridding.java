public class cwh_32_method_overridding {
            static void foo(){
                 System.out.println("Good Morning bro!");
            }

            static void foo(int a ){
                System.out.println("Good Morning" + a + "bro!");
            }

            static void foo(int a ,int b ){
                System.out.println("Good Morning" + a + "bro!");
                System.out.println("Good Morning" + b + "bro!");
            }
            // static void telljoke(){
            //     System.out.println("I invented this World");
            // }
                // static void change(int a){
                //     a = 98;
                // static void change2(int  arr[]) {
                //     arr[0] = 98; 
                // }


public static void main(String[] args) {
    // telljoke();
        // int [] marks = {52,73,77,89,98,94};
        // case 1 --> changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is: " +x);
//         change2(marks);
//         System.out.println("The value of x after runnning change is "+ marks[0]);
// }
foo();
foo(3000);
foo(2000,1000);
// 3000 --> yeh argumnent hote h jo actual hote h ;
//  parameters hote h woh actual nahi hote h;
}
}