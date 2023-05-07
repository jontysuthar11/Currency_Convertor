import javax.annotation.processing.SupportedOptions;

enum Status{
    Running , Failed, Pending, Success;
}

public class enum2 {
    public static void main(String[] args) {
        
            Status s = Status.Running;

             switch(s)
             {
                case Running:
                System.out.println("All Good");
                break;

                case Failed:
                System.out.println("Try again");
                break;

                case Pending:
                System.out.println("Please Wait");
                break;

                default:
                System.out.println("Please Waitttt");
                break;
             }
            
              /* if(s== Status.Running)
                 System.out.println("ALL Good");
                else if (s==Status.Failed)
                System.out.println("Try Again");

                else if(s== Status.Pending)
                System.out.println("Please Wait");
                else
                System.out.println("Done");
                                    */  
    }
}
