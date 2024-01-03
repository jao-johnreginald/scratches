import java.util.Random;
import java.util.Scanner;

class Scratch {


    public static void main(String[] args) {

        Random barneyRandomizer = new Random();
        int solution = barneyRandomizer.nextInt(10) + 1;

        print("Barney is a dinosaur from our imagination...");
        print("I will haunt you in your dreams if you don't follow my instructions :)");
        print("Hey kids it's Barney! Today I'm gonna force you to play a game.");
        print("You have to guess the number between 1 to 10.");
        print("And for every wrong guess I will cut one of your fingers off");
        print("Have fun! :)");

        Scanner barneyScanner = new Scanner(System.in);

        barneyGuess(solution, barneyScanner);

    }

    static void barneyGuess(int solution, Scanner barneyScanner) {
        int guess = barneyScanner.nextInt();

        if (guess == solution) {
            print("You guessed the answer!");
            print("This game was just a distraction to give me enough time to locate your address");
            print("See you at your room while your sleeping! Hugh Hugh Hugh :)");
        } else if (guess < solution) {
            print("Too low, bozo! Guess again:");
            barneyGuess(solution, barneyScanner);
        } else {
            print("Too high, stinky fly! Guess again:");
            barneyGuess(solution, barneyScanner);
        }
    }

    static void print(Object anything) {
        System.out.println(anything);
    }

}