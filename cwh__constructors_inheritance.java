

class Base1{

    Base1(){
        System.out.println("Mai ek constructor hu");
    }

    Base1(int x){
        System.out.println("I am  an overloaded  constructor with value of x as :"+x);
    }
        
}

    class Derived1 extends Base1{

        Derived1(){
            // super(0);
            System.out.println("I am a derived class constructor");
        }

        Derived1(int x , int y){
                super(x);
                System.out.println("I am an overloaded constructor of Derived with value of y as :"+y);
        }
        public int y;

        public int getY(){
            return y;
        }

        public void setY(int y){
            this.y = y;
        }
    }
        class childofderived extends Derived1{
            childofderived(){
                System.out.println("I am a child of derived constructor");
            }

         
            childofderived(int x , int y , int z)
            {
                super(x,y);
                System.out.println("I am an overloaded constructor of Derived with value of z as : "+z);
            }
        }
    
public class cwh__constructors_inheritance {
    public static void main(String[] args) {
                 Base1 b = new Base1();
                // //  agr derived me ni hoga constructor toh bhi base wala run hoga
                // Derived1 d = new Derived1(14,9);
                //  hoga toh bhi pheke base ka run hoga phir derive wala run hogaa
                childofderived cd = new childofderived(12,13,14);
               
                    
                

    }
}
