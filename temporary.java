import javax.sound.sampled.SourceDataLine;

class Animal{
     public void eat(){
        System.out.println("animal is eating");
     }

     public void doing(){
        System.out.println("Animal is doing something");
     }
}

class Dog extends Animal{ 
    public void bark(){
        System.out.println("The dog is barking now");
    }
}
public class temporary {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.doing();
    }
}
