
class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

/* class B extends  A     // if we don't want to create a new class
{
    public void show()
    {
        System.out.println("in B show");
    }
}*/

public class innerclass1 {
        public static void main(String[] args) {
            // here we are overridding the method of class A;
          /*  A obj = new B(); 

          */ 
             A obj = new A();
             {
                public void show()
                {
                    System.out.println("in new show ");
                }
             }
               
            obj.show();
        }
}
