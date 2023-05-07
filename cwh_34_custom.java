class Employee{
    int id ;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("MY id is " +id);
        System.out.println("and my name is " +name);
    }
            public int getSalary(){
                return salary;
            }
        
}

public class cwh_34_custom {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee jonty = new Employee();
        Employee john = new Employee();
        
        jonty.id = 10;
        jonty.name = "Jonty";
        jonty.salary = 120000;

        john.id = 12;
        john.name = "John";
        john.salary =45000;
        
        jonty.printdetails();
        john.printdetails();
        int salary = jonty.getSalary();
        System.out.println(salary);
    //   System.out.println(jonty.id);
    //   System.out.println(jonty.name);
    }
}
