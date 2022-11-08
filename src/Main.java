public class Main {

    public static void main(String[] args) {

        // Byte
        // Short
        // Int
        // Long
        // Float
        // Double

        // Char
        char myChar1 = 'A';
        System.out.println("myChar1: " + myChar1);

        char myChar2 = '\u0042';
        System.out.println("myChar2: "+ myChar2);

        // Boolean
        boolean isApplicable = true;
        System.out.println("isApplicable: "+isApplicable);

        // String
        String myString = "Welcome!";
        System.out.println(myString);

        myString = myString + " \u0040";
        System.out.println(myString);

        int myInt = 10;
        myString = myString + myInt;
        System.out.println(myString);

        // Ternary operator
        String passOrFail = "fail";
        int score = 51;

        /*if(score >= 50){
            passOrFail = "passed";
        } else{
          passOrFail = "failed";
        }*/

        passOrFail = (score >= 50) ? "passed" : "failed";
        System.out.println("Student A is " + passOrFail);

        // Operator challenge
        double value1 = 20.00d;
        double value2 = 80.00d;
        System.out.println("(value1 + value2) * 100 = " + (value1 + value2) * 100);
        System.out.println("Reminder of (value1 + value2) * 100 by 40.00 = " + ((value1 + value2) * 100) % 40.00);
        boolean isRemainded = (((value1 + value2) * 100) % 40.00) != 0 ? true : false;
        System.out.println("isRemainded = " + isRemainded);

        if(isRemainded){
            System.out.println("Got some remainder.");
        }
    }
}