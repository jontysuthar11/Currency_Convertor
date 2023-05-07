import javax.sound.sampled.SourceDataLine;

  abstract class Car 
{
    public abstract  void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

 abstract class wagonR extends Car{
      public void drive(){
        System.out.println("driving...");
      }

    //   public void fly(){
    //     System.out.println("FLying car....");
    //   }
    } 
    class UpdateWagonR extends wagonR{
        public void fly(){
            System.out.println("Flying...");
        }
    }


public class Demo { 
    public static void main(String[] args) {
        Car Obj = new UpdateWagonR();
        Obj.drive();
        Obj.playMusic();
        Obj.fly();
    }
}
