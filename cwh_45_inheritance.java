class Base{
    int x;
    public int getx(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
 
class Derived extends Base{
        int y;

        public int getY(){
            return y;
        }

        public void setY(int y){
            this.y=y;
        }
}
public class cwh_45_inheritance {
   public static void main(String[] args) {
            Base b = new Base();
            b.setX(4);
            
            System.out.println(b.getx());

            Derived d = new Derived();
            d.setX(42 );
            
            System.out.println(d.getx());
   } 
}
