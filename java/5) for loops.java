class Scratch {

    public static void main(String[] args) {

        String[] goofyAhhs = {"Tigger", "Po", "Pigger", "Mini Van", "Stuart"};

        // This is the 'for loop' - inside the brackets are 3 java statements separated by a semicolon ;
        // The 1st statement is some code that will run once before the loop starts
        // The 2nd statement is a conditional logic that checks every loop, if it's true, then it will run
        // The 3rd statement runs after each time a loop completes
        // We can use 'count++' instead of 'count = count + 1'
        int arraySize = goofyAhhs.length;
        System.out.println("About to run the 'for loop'");
        for (int count = 0; count < arraySize; count++) {
            System.out.println(goofyAhhs[count]);
        }

        // This is the 'for each loop' - inside the brackets is 1 statement,
        // a variable type and name, then a colon, then the array
        // e.g. for (String stringVariable : stringArray) {}
        System.out.println("About to run the 'for each loop'");
        for (String goofyAhh : goofyAhhs) {
            System.out.println(goofyAhh);
        }

    }
}