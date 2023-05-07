import java.rmi.server.SocketSecurityException;

// when we have only abstract methods we so instead of creating abstract class we can create interfaces;
//here interface is not class
// in this by default everymethod in interface is public abstract;

// Interface tell you what are the methods but can't implement it;
//here methods we can also create variables

interface A {

    int age = 44;
    String area = "Vadodara";     // by default they are final and static;   --->> so we have to ionitialize

    void show();
    void config();
}

class B implements A 
 {    // to extend interface we use IMPLEMENT keyword ;
public void show(){
    System.out.println("in show");
}

public void config(){
     
        System.out.println("in config");
    }
}


public class Interface {
   public static void main(String[] args) {
    A obj = new B();

    // since it is static so we can add by iterface name also

    obj.show();
    obj.config();
    System.out.println(A.area);
   } 
}
