class Scratch {
    public static void main(String[] args) {

        // We can declare a array with the type, followed by square brackets
        String[] barneyStringArray;
        int[] barneyIntArray;
        // We can't put things inside the array until we initialize it
        // We can initialize it a few different ways

        // One way is to create an empty array, but we *must* specify how big it is
        barneyStringArray = new String[4]; // this array has space for 4 strings
        barneyIntArray = new int[3]; // this array has space for 3 integers
        // Then we can start putting things inside it one by one,
        // by using the square brackets [] and specifying the number - called the 'index'

        // In Java, all arrays are 'zero' based, so the first item is always '0'
        barneyStringArray[0] = "First string";
        barneyStringArray[1] = "Second string";
        barneyStringArray[2] = "Third string";
        barneyStringArray[3] = "Fourth string";

        barneyIntArray[0] = 5;
        barneyIntArray[1] = 3;
        barneyIntArray[2] = 8;

        // We can access the variables in the array using myVariable[0]
        System.out.println(barneyStringArray[1]);
        System.out.println(barneyStringArray[3]);
        System.out.println(barneyIntArray[0]);

        // Another way is to provide the array contents at the point we initialize it,
        // to do this we use curly braces {}
        String[] names = {"Po", "Mini van", "Humper", "Boss croc"};
        double[] decimalNumbers = {0.3, 12.78, 143.9, 3.667, 4.3};
        // Using an 'initializer block' like above HAS TO BE DONE at the moment you declare the variable
        // String[] barneyArrayAssignedLater;
        // THIS WON'T WORK -> barneyArrayAssignedLater = {"can't use initializer block later", "has to be done when variable is declared"};
        String[] barneyArrayAssignedImmediately = {"this is fine", "no worries"};

        System.out.println(names[2]);
        System.out.println(decimalNumbers[2]);
        System.out.println(barneyArrayAssignedImmediately[1]);

        // We need 'For Loops' to call out all the items in an array



    }
}