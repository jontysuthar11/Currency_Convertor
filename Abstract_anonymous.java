abstract class A{
    public abstract void show();
    public abstract void config();
}

public class Abstract_anonymous {
    public static void main(String[] args) {
        A obj  = new A(){
        public void show(){
        
            System.out.println("in new show");

                }    
                
                public void config(){
                    System.out.println("in Config");
                }
               };
               obj.show();
               obj.config();
    }
}
  