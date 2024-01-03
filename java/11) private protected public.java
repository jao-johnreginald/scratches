class Scratch {

    public static void main(String[] args) {
        AccessLevelModifiers levelTester = new AccessLevelModifiers();
//        levelTester.aPrivateField; -> WON'T WORK. This is a private field that cannot be accessed outside its class
//        levelTester.aPrivateMethod(); -> WON'T WORK. This is a private method that cannot be accessed outside its class
        String returnedPrivateField = levelTester.aPublicMethod();
        System.out.println("Got the private field from the public method, Field is: " + returnedPrivateField);
        // The below 'protected' method is ok to call (as in these scratch files it's as if we're in the same package)
        // This method then calls its internal 'private' method, and so we can see the output
        levelTester.aProtectedMethod();

        System.out.println();
        System.out.println("*** ScoreKeeper Demo ***");

        ScoreKeeper scoreKeeper = new ScoreKeeper();
//        scoreKeeper.playerOneScore = 5; -> This isn't good! It's possible to cheat with our ScoreKeeper code! This should be private
//        scoreKeeper.checkForWinner(); -> This isn't necessary! We don't need to check for a winner unless the score changes. This should be private
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
    }


}

class AccessLevelModifiers {

    /*
    IN KOTLIN, BY DEFAULT, FIELDS AND METHODS ARE PUBLIC UNLESS SPECIFIED OTHERWISE
    There are 4 levels of access in Java: public, protected, default, private
    These are shown below, from most visible to most restricted
     */
    public String aPublicField = "This can be accessed from any class";
    protected String aProtectedField = "This can be accessed from either: a class in the same package, or a subclass (child class)";
    String aDefaultAccessField = "This can be accessed from a class in the same package only";
    private String aPrivateField = "This can only be accessed from within this class";

    public String aPublicMethod() {
        System.out.println("In the public method");
        return aPrivateField;
    }

    protected void aProtectedMethod() {
        System.out.println("In the protected method");
        aPrivateMethod();
    }

    private void aPrivateMethod() {
        System.out.println("In the private method");
    }

}

class ScoreKeeper {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public void playerOneCorrectAnswer() {
        playerOneScore++;
        String fullText = "PLayer One got one right! Player One " + playerOneScore + " - PLayer Two " + playerTwoScore;
        System.out.println(fullText);
        checkForWinner();
    }

    public void playerTwoCorrectAnswer() {
        playerTwoScore++;
        String fullText = "PLayer Two got one right! Player One " + playerOneScore + " - PLayer Two " + playerTwoScore;
        System.out.println(fullText);
        checkForWinner();
    }

    private void checkForWinner() {
        if (playerOneScore == 5) {
            System.out.println("Player One Wins!");
        } else if (playerTwoScore == 5) {
            System.out.println("Player Two Wins!");
        }
    }

}