 class Calc 
 {
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
 }

public class inheritance {
    public static void main(String[] args) {
       Adv_Calc obj = new Adv_Calc();
      int r1 = obj.add(4,5);
      int r2 =   obj.sub(5, 2);
      int r3=   obj.multi(5, 2);
      int r4 =   obj.div(6, 2);
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r4);

    }
}
