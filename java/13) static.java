// In Java, EVERYTHING must be inside a class
// public String string = "variable outside a class"; -> Won't work. Not inside a class

class TestingStatic {

    /*
    Non static - When things are not static, any members (properties, methods) belong to the instance of the class
    We have to make a new object, so -> TestingStatic someObject = new TestingStatic();
    We then have access to the non-static properties and methods of that instance
     */

    public String nonStaticVariable = "Hello";

    public void nonStaticMethod() {
        System.out.println("Inside the non-static method");
    }

    /*
    Static - Fixed, only ever in one 'place', or in programming, only ever one 'instance'
    It belongs to the class, not to any instance/object of the class
    We don't need to make an object 'new TestingStatic();' to access a static property or method
    We just call the name of the class, and then the property/method -> TestingStatic.staticMethod;
    We don't use curly brackets at all, as we're not making any instance of the class
     */

    // Accessed with TestingStatic.staticVariable;
    public static String staticVariable = "World";

    // Accessed with TestingStatic.staticMethod();
    public static void staticMethod() {
        System.out.println("Inside the static method");
    }

    /*
    This is how we would do a 'const val' in Java
    public - so we can access it from anywhere
    final - so it can't be changed later
    static - so we don't need an object to access it, we can just do TestingStatic.MEANING_OF_LIFE;
     */
    public final static int MEANING_OF_LIFE = 42;

}

class Scratch {

    public static void main(String[] args) {
        TestingStatic newObject = new TestingStatic();
        System.out.println(newObject.nonStaticVariable);
        newObject.nonStaticMethod();

        System.out.println(TestingStatic.staticVariable);
        TestingStatic.staticMethod();

        System.out.println(TestingStatic.MEANING_OF_LIFE);
    }

}