import java.util.function.DoublePredicate;

class Cylinder{
        private int radius;
        private  int height;

    public Cylinder(int radius , int height){
        this.radius = radius;
        this.height = height;
    }        
        public int getradius(){
            return radius;
        }
        
        public void setradius( int radius  ){
            this.radius = radius;
        }
        

        public int getheight(){
            return height;
        }

        public void setheight(int height){
            this.height = height;
        }
         public double surfaceArea(){
            return 2* 3.142* radius * radius + 2*3.142*radius*height;
         }

         public double volume(){
            return  3.142* radius * radius *height;
            // we can use Math.PI instead of 3.14;
         }
}

class Rectangle{
     private int  length;
     private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
          public int getlength(){
            return length;
          }       

          public int getbreadth(){
            return breadth;
          }
}
public class cwh_44_ps09 {
    public static void main(String[] args) {

        // PROBLEM  1 ---------------->> 
        /* 
        Cylinder mycylinder = new Cylinder(12,9);
          // mycylinder.setheight(12);
           int h = mycylinder.getheight();
        //   System.out.println(h);

           mycylinder.setradius(9);
          System.out.println(mycylinder.getradius());

           //problem 2---->>>

           System.out.println(mycylinder.surfaceArea());
             System.out.println(mycylinder.volume());   

        // Problem 3*/

        Rectangle r = new Rectangle();
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
    }
}
