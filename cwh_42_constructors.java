class MymainEmployee{
    private int id;
    private String name;
}

public String getName(){
    return name;
}

public void setName(String n){
    this.name = n;
}
public void setId(int i){
  
   this.id = i;
}

public int getId(){
    return id;
}
public class cwh_42_constructors {
   public static void main(String[] args) {
    MymainEmployee jonty = new MymainEmployee();
    jonty.setName("JOntysuthar");
    jonty.setId(34);
    
   } 
}
