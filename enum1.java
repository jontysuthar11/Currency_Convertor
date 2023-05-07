import javax.xml.transform.Source;

enum Status {     // in java this status is a class;
    Running , Failed , Pending , Success ;   // ----->> this are the constants

        // for number of this we use ordinal()method;

    // instead of any specific format we can print easily;
}


public class enum1 {
    public static void main(String[] args) {
        int i = 5;
       // Status s = Status.Running;  // here status is a type;
        // Status s = Status.Failed;
       // System.out.println(s.ordinal());
           
      Status  [] ss = Status.values();
      // System.out.println(ss[1]);  // getting only one value 

        for(Status s : ss )
        {
         System.out.println(s);
        }

        // we will get values because here status is a class;
    }
}
