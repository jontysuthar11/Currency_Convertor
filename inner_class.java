
    class A {
        int age;
        public void show()
        {
            System.out.println("in show");
        }
 
        class B {
             public void config()
              { 
                System.out.println("IN config");}
        }
    }

public class inner_class {
    public static void main(String[] args) {
         A obj = new A();
         obj.show();

        /*
         syntax :- 
         
            outer class  inner class innerclass obj = obj_outerclass new innerclass();
         */
         A.B obj1 = obj.new B();
         obj1.config();
    }
}
