public class resultingdatatype {
    public static void main(String[] args){
        // byte x = 5;
        // int y = 6;
        // short z = 8;
        // int a = y+z;
        // System.out.println(a);
        // float b = 6.54f + x;
        // System.out.println(b);

        // Increament and Decrement operator
        int i = 56;

        // int b = i++ first b is assigned i and then i is increamented to b;
        // int c = j++ first j is increamented and then j is assigned to c;

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int j = 45;

        System.out.println(++j); // first increament then assign
        System.out.println(j--);
        System.out.println(j--);
        System.out.println(j++);

        int y = 7;
        // int x = y++ * 8;
        System.out.println(++y *8);
    }
}
