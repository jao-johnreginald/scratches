class Scratch {


    public static void main(String[] args) {
        System.out.println(getDifficulty(2));
        System.out.println(getDifficulty(4));

        System.out.println(getScore(1));
        System.out.println(getScore(2));
        System.out.println(getScore(3));
        System.out.println(getScore(4));
    }

    // *** A switch statement using 'break' commands to stop the code running further down ***
    private static String getDifficulty(int level) {
        // *** DOING IT USING A REGULAR 'IF ELSE IF ELSE' BLOCK ***
//        String difficulty;
//        if (level == 1) {
//            difficulty = "Easy";
//        } else if (level == 2) {
//            difficulty = "Medium";
//        } else if (level == 3) {
//            difficulty = "Hard";
//        } else {
//            difficulty = "Invalid Level Input";
//        }
//        return difficulty;
        String difficulty;
        switch (level) {
            case 1:
                difficulty = "Easy";
                break;
            case 2:
                difficulty = "Medium";
                break;
            case 3:
                difficulty = "Hard";
                break;
            default:
                difficulty = "Invalid Level Input";
        }
        return difficulty;
    }

    // If we don't put the command 'break', the code STARTS at the case, but continues downwards
    // Either until the end of the default block, or until it hits a break
    private static int getScore(int targetsHit) {
        int score = 0;
        switch (targetsHit) {
            case 3:
                score = score + 10;
            case 2:
                score = score + 5;
            case 1:
                score = score + 1;
                break;
            default:
                score = -1;
        }
        return score;
    }


}