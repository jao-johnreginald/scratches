class Scratch {
    // Null - when a variable container, a pot in memory, is empty
    // In Java, when we declare a variable but don't assign an initial value, by default it will be 'null'
    static GoofyAhh myGoober;
    static String aNullString;
    // 'Primitive' data types cannot be null. They always have a default value
    // We've seen some of these 'primitive' types before e.g. int, double, float, boolean etc.
    // Any variable starting with a small letter
    static int myIntVariable;

    public static void main(String[] args) {

//        myGoober.name = "Pigger"; -> There will be no error in our code, but this will throw an Exception(error) when it runs
//        myGoober.bark();

        myGoober = new GoofyAhh();
        myGoober.name = "Pigger";
        myGoober.bark();
        String fullString = "The goober's name is " + myGoober.name;
        System.out.println(fullString);

        myGoober = null;
//        myGoober.bark(); -> This will throw an Exception because now myGoober is null again

        System.out.println(aNullString);
//        aNullString.toUpperCase(); -> We can't call a method on our 'null' String

        System.out.println(myIntVariable);

        // An 'int' variable defaults to 0, a 'boolean' variable defaults to 'false'
        
    }

}

class GoofyAhh {
    String name;
    public void bark() {
        System.out.println("Yee haha yee haha");
    }

}