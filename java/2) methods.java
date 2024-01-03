class Scratch {



    public static void main(String[] args) {
        print("This is the 'main' method");

        barneyMethod();

        greetBarney("Barney");
        greetBarney("Duck");
        greetBarney("Po");

        combineNames("Mini","Van");

        String myFetchedFullName = getFullName("JetSki", "Van");
        print(myFetchedFullName);

        int result = addNumbers(35, 34);
        print(result);
    }

    // This is how to write a method, with a name called 'barneyMethod'
    static void barneyMethod(){
        print("This is the 'barney' method");
    }

    // This is a method with a (String) parameter. We can use the parameter as a variable in this method
    static void greetBarney(String name) {
        print("Goofy ahh " + name);
    }

    // This is a method with multiple parameters
    static void combineNames(String firstName, String lastName) {
        String combinationNames = firstName + " " + lastName;
        print("Goofy goober " + combinationNames);
    }

    // This is a method with a return value; it returns a String
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // This method with a return value returns an integer
    static  int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static void print(Object anything) {
        System.out.println(anything);
    }

}