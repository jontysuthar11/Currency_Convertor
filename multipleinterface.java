// class -- class --> extends
// class -- interface  --> implements
// interface -- interface --> extends


interface A {

    int age = 44;
    String area = "Vadodara";     // by default they are final and static;   --->> so we have to ionitialize

    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A,X 
 {    // to extend interface we use IMPLEMENT keyword ;
public void show(){
    System.out.println("in show");
}

public void config(){
     
        System.out.println("in config");
    }

    public void run(){
        System.out.println("Running...");
    }
}


public class multipleinterface {
   public static void main(String[] args) {
    A obj = new B();

    // since it is static so we can add by iterface name also

    obj.show();
    obj.config();
    System.out.println(A.area);
       
   // obj.run()  // so we can't run because it has another interface;

   X obj1 = new B();
   obj1.run();

   }
}






 
