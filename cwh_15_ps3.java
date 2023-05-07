public class cwh_15_ps3 {
    public static void main(String[] args) {
        
        //  convert string to lowercase

        String name = "Jonty Suthar";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem2
        // Replace spaces with underscore;
        String text = "To My Friend";
        text =  text.replace("","_");
        System.out.println(text);


        // Problem 3 
        String letter = "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>","Jonty"); // mene letter ko chlaya h assign nahi kiya h 
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5 
        String myLettter = "Dear Jonty , \n\t You are Nice.\n\t Thanks!";
        System.out.println(myLettter);
    }
}
