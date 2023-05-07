class Computer
{
    public void code(){
          
    }
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("COde , compile , run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code, compile , run : Faster ");
    }
}

class Developer

{
 public void devApp(Computer lap) // class name and its object in  devApp method(parameters)
 {
    lap.code();
 }   
}

public class exofinterface {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        Computer lap = new Laptop();
       Computer desk = new Desktop();
        Developer jonty = new Developer();
        jonty.devApp(desk); // jonty.devApp(desk);

    }
    
}
