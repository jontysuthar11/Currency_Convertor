public class abstract_bike {
  
    abstract class bike{
   public  abstract void run();
}

    public void run() {
    }
}
class Honda extends abstract_bike{
public void run(){
    System.out.println("Running safely");
}
public static void main(String[] args) {
   abstract_bike obj   = new Honda();
   extracted(obj);
}
private static void extracted(abstract_bike obj) {
    obj.run();
}
}


