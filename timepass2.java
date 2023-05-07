class Employee{
    int id ;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+ name);
    }
}

public class timepass2 {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee jonty = new Employee();
        Employee yashvini = new Employee();
        jonty.id = 10;
        jonty.name = "Jonty";

        yashvini.id = 06;
        yashvini.name = "yashvini";
        // System.out.println(jonty.id);
        // System.out.println(jonty.name);
        jonty.printDetails();
        yashvini.printDetails();
    }
}
