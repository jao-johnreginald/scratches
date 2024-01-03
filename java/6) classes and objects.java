import java.util.Scanner;

class Scratch {
    static GoofyAhh goober1;
    static GoofyAhh goober2;
    static GoofyAhh goober3;
    static GoofyAhh goober4;
    static GoofyAhh goober5;
    static Scanner barneyScanner;
    static int character;

    public static void main(String[] args) {

        createGoofyAhhs();

        makeTheGoobersIntroduceThemselves();

        print("Choose a character");

        tellUserWhatToType();

        barneyScanner = new Scanner(System.in);
        chooseGoofyAhh(barneyScanner);

        print("Now who do you want to attack?");
        tellUserWhatToType();

        attackGoofyAhh();

    }

    static void makeTheGoobersIntroduceThemselves() {
        goober1.sayHello();
        goober2.sayHello();
        goober3.sayHello();
        goober4.sayHello();
        goober5.sayHello();
    }

    private static void tellUserWhatToType() {
        print("Type '1' for Pigger");
        print("Type '2' for Tigger");
        print("Type '3' for Mini van");
        print("Type '4' for Po");
        print("Type '5' for Humper");
    }

    private static void attackGoofyAhh() {
        int attack = barneyScanner.nextInt();

        if (attack == 1) {
            if (character == 1) {
                goober1.selfSabotage();
            } else if (character == 2) {
                goober2.challenge(goober1);
            } else if (character == 3) {
                goober3.challenge(goober1);
            } else if (character == 4) {
                goober4.challenge(goober1);
            } else if (character == 5) {
                goober5.challenge(goober1);
            }
        } else if (attack == 2) {
            if (character == 1) {
                goober1.challenge(goober2);
            } else if (character == 2) {
                goober2.selfSabotage();
            } else if (character == 3) {
                goober3.challenge(goober2);
            } else if (character == 4) {
                goober4.challenge(goober2);
            } else if (character == 5) {
                goober5.challenge(goober2);
            }
        } else if (attack == 3) {
            if (character == 1) {
                goober1.challenge(goober3);
            } else if (character == 2) {
                goober2.challenge(goober3);
            } else if (character == 3) {
                goober3.selfSabotage();
            } else if (character == 4) {
                goober4.challenge(goober3);
            } else if (character == 5) {
                goober5.challenge(goober3);
            }
        } else if (attack == 4) {
            if (character == 1) {
                goober1.challenge(goober4);
            } else if (character == 2) {
                goober2.challenge(goober4);
            } else if (character == 3) {
                goober3.challenge(goober4);
            } else if (character == 4) {
                goober4.selfSabotage();
            } else if (character == 5) {
                goober5.challenge(goober4);
            }
        } else if (attack == 5) {
            if (character == 1) {
                goober1.challenge(goober5);
            } else if (character == 2) {
                goober2.challenge(goober5);
            } else if (character == 3) {
                goober3.challenge(goober5);
            } else if (character == 4) {
                goober4.challenge(goober5);
            } else if (character == 5) {
                goober5.selfSabotage();
            }
        } else {
            print("Please choose a number only from 1 to 5");
            chooseGoofyAhh(barneyScanner);
        }
    }

    private static void createGoofyAhhs() {
        goober1 = new GoofyAhh("Pigger", "Yee haha yee haha", "Pig", 10);
        goober2 = new GoofyAhh("Tigger", "Ugh haha ugh haha", "Mental hospital patient", 9);
        goober3 = new GoofyAhh("Mini van", "Beep beep", "Van", 4);
        goober4 = new GoofyAhh("Po", "YEE HA", "Panda", 8);
        goober5 = new GoofyAhh("Humper", "HUMP --- HUMP --- BOOM", "Tank", 6);
    }

    static void print(Object anything) {
        System.out.println(anything);
    }

    static void chooseGoofyAhh(Scanner barneyScanner) {
        int characterNumber = barneyScanner.nextInt();

        if (characterNumber == 1) {
            goober1.thanks();
            character = 1;
        } else if (characterNumber == 2) {
            goober2.thanks();
            character = 2;
        } else if (characterNumber == 3) {
            goober3.thanks();
            character = 3;
        } else if (characterNumber == 4) {
            goober4.thanks();
            character = 4;
        } else if (characterNumber == 5) {
            goober5.thanks();
            character = 5;
        } else {
            print("Please choose a number only from 1 to 5");
            chooseGoofyAhh(barneyScanner);
        }
    }

}

class GoofyAhh {

    // Classes have things that they 'know'. This is called the class 'State'.
    String name;
    String greeting;
    String breed;
    int power;

    // Classes have things they can 'do'. This is the class 'Behavior'.

    void sayHello() {
        String fullString = greeting + "! I'm goofy ahh " + name + ". My breed is " + breed + ". My power level is " + power + " / 10.";
        System.out.println(fullString);
    }

    void challenge(GoofyAhh challengerGoober) {
        String fullString4 = this.greeting + "! I, " + this.name + ", will now attack " + challengerGoober.name;
        System.out.println(fullString4);
        if (challengerGoober.power > this.power) {
            String fullString2 = "Oof! " + challengerGoober.name + " was stronger than me! I'll just attack Rainier instead.";
            System.out.println(fullString2);
        } else {
            String fullString7 = "I killed you bozo " + challengerGoober.breed;
            System.out.println(fullString7);
            String fullString3 = this.greeting + "! Nobody messes with " + this.name;
            System.out.println(fullString3);
        }
    }

    void thanks() {
        String fullString5 = this.greeting + "! Thank you for choosing me, the goofiest of the goobers... " + this.name + "!";
        System.out.println(fullString5);
    }

    void selfSabotage() {
        String fullString6 = this.greeting + "! I'm such a stupid Goofy Ahh " + this.breed + ", I friendly fired myself.";
        System.out.println(fullString6);
    }

    // Classes can specify how they are to be 'built' (made into Objects). This is the class 'Constructor'.
    GoofyAhh(String name, String greeting, String breed, int power) {
        this.name = name;
        this.greeting = greeting;
        this.breed = breed;
        this.power = power;
    }

}