abstract class arithmatic_operation
{
    abstract void printInfo();
}

class add extends arithmatic_operation
{
    void printInfo()
    {
        int a = 3;
        int b = 4;
        System.out.println(a+b);

    }
}
    class sub extends arithmatic_operation
    {
        void printInfo()
        {
            int c = 4;
            int d = 5;
            System.out.println(c-d);
        }
    }

public class abstraction {
    public static void main(String[] args) {
                arithmatic_operation n = new add();
                n.printInfo();

                arithmatic_operation y = new sub();
                y.printInfo();
    }
}
