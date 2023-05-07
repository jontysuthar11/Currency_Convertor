public class cWh_14_stringmethods {
    public static void main(String[] args) {
        
        String friend = "Harry";
        // System.out.println(friend);
         
        // .lenth() to find the length of string;

        int value = friend.length();
        // System.out.println(value);

        // tolowercase
        // String lString = friend.toLowerCase();
        // System.out.println(lString);

        //  touppercase
        
        // String uString = friend.toUpperCase();
    //     System.out.println(uString);
        
        // nonTrimmedString    --->> yeh jo spaces hogi wo bhi print kregaa
        
            // String nonTrimmedString = "   harry  ";
            // System.out.println(nonTrimmedString);
            // String trimmedString; // yeh jo faaltu space hoga usko hta dega
            // System.out.println(nonTrimmedString.trim());


            /* Substring 
            yeh wo h jisme jisme index daalne k baad konsa character h wo locate krega;
            */
            
            // System.out.println(friend.substring(3));
            // System.out.println(friend.substring(1,4)); // yeh ek char km print krega giver value se

             /* 
             replace();
             */
            System.out.println(friend.replace('r', 'p'));
            System.out.println(friend.replace("r","ier"));

            /*
            startswith() & endwiths
            */
            System.out.println(friend.startsWith("Ha"));
            System.out.println(friend.endsWith("rry"));

            /*
            charAt(); , indexOf()
            */
            System.out.println(friend.charAt(2));
            // System.out.println(friend.indexOf("r"));

            String modifiedName = "Harryrry";
            System.out.println(modifiedName.indexOf("rry"));
            System.out.println(modifiedName.indexOf("rry", 4)); // last word  print hoga 
            System.out.println(modifiedName.indexOf("rryjki",4));
                  // -1 retrun krega if string k related nahi hoga
                  System.out.println(modifiedName.lastIndexOf("rry",7));

                  System.out.println(friend.equals("Harry"));
                  System.out.println(friend.equals("harry"));
                  System.out.println(friend.equalsIgnoreCase("haRry"));

                  System.out.println("I am escape sequence \" double quote"); 
                  System.out.println("I am escape sequence \\ double quote"); 
                  System.out.println("I am escape sequence \n double quote");
                  System.out.println("I am escape sequence \t double quote");
         }
}
