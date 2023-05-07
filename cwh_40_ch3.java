class Employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setId(int i ){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class cwh_40_ch3 {
    public static void main(String[] args) {
        Employee jonty = new Employee();
        //  jonty.id = 45;
        //  jonty.name = "jon";   // throws an error due to private access specifier;
           jonty.setName("I am jonty");
           System.out.println(jonty.getName());
           jonty.setId(256);
           System.out.println(jonty.getId());
    }
}
