
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Box 
{
    int l,b,h;
    void set(int a , int k , int c){
        l=a;
        b=k;
        h=c;
    }
    void area ()
    {
        double area = l*b*h;
        System.out.print(area);
    }
}
    class Main{
        public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the length of box");
         int a = sc.nextInt();
         
         System.out.println("Enter the breath of box");
         int b = sc.nextInt();
         
         System.out.println("Enter the height of box");
         int c = sc.nextInt();
         
        Box j = new Box();
        j.set(a,b,c);
        j.area();
      
        
    }
}
