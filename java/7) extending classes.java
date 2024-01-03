class Scratch {


    public static void main(String[] args) {
        GoofyAhh myGoofyAhh = new GoofyAhh();
        myGoofyAhh.name = "Po";
        myGoofyAhh.type = "Panda";
        myGoofyAhh.noise = "YEE HA!";

//        myGoober.germCount - THIS WON'T WORK! GoofyAhhs don't have this field, only Minions do!

        myGoofyAhh.sayHello();
        myGoofyAhh.makeNoise();
        myGoofyAhh.sleep();

//        myGoober.deepPoke() - THIS WON'T WORK! GoofyAhhs don't have this field, only Minions do!

        Minion myMinion = new Minion();
        myMinion.name = "Stuart";
        myMinion.type = "Minion";
        myMinion.noise = "Yee hihi Yee hihi!";
        myMinion.germCount = 5;

        myMinion.sayHello();
        myMinion.makeNoise();
        myMinion.sleep();
        myMinion.deepPoke();

        Vehicle humperTheTank = new Vehicle();
        humperTheTank.name = "Humper";
        humperTheTank.type = "Tank";
        humperTheTank.noise = "HUMP ----- HUMP ----- BOOM!";
        humperTheTank.hasGuns = false;

//        humperTheTank.deepPoke() - THIS WON'T WORK! Vehicles don't have this field, only Minions do!

        humperTheTank.sayHello();
        humperTheTank.makeNoise();
        humperTheTank.sleep();
        humperTheTank.willShootYou();
    }
}

class GoofyAhh {

    String name;
    String type;
    String noise;

    void sayHello() {
        String fullText1 = "Hello, my name is " + name + ". I am the goofy goober " + type + "!";
        System.out.println(fullText1);
    }

    void makeNoise() {
        System.out.println(noise);
    }

    void sleep() {
        System.out.println("OOOOOOOOOOH..... OOOOOOOOOOH.......");
    }

}

// This class takes all of the 'GoofyAhh' class' fields and methods, and is able to EXTEND them
// It inherits all the 'GoofyAhh' state and behavior, as well as being able to add extra stuff
class Minion extends GoofyAhh {

    // We get all of the goofyahh fields, and we add a specific one to Minions
    int germCount;

    // We get all of the goofyahh methods, and we add a specific method to Minions
    void deepPoke() {
        String fullString2 = noise + " Look how goofy I am! I deep poked you! <poke, poke>";
        System.out.println(fullString2);
    }

}

class Vehicle extends GoofyAhh {

    // You can set default values to your classes and objects
    // If this field hasn't been given a value, it will be 'true' by default
    boolean hasGuns = true;

    void willShootYou() {
        if (hasGuns) {
            String fullString3 = noise + " <shoots you> GIVE ME ALL YOUR MONEY!";
            System.out.println(fullString3);
        } else {
            String fullString4 = noise + " <runs you over> GIVE ME ALL YOUR MONEY!";
            System.out.println(fullString4);
        }
    }

}