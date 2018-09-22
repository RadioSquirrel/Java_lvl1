/**
 * Java. Level 1. Lesson 3. Homework_3
 * @author Plieva Maya
 * @version Sep 19, 2018
 */

import java.util.*;

class Homework_3 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Two tasks for guess: 1 - number, 2 - word");
        int task = in.nextInt();
        if (task == 1) TaskNumber();
        else TaskWord();
    }

    static void TaskNumber() {
        do {
            int guess = -1;
            int count = 0;
            int number = rand.nextInt(10);
            while (number != guess && count < 3) {
                System.out.print(
                        "Attempt number " + (count + 1));
                try {
                    guess = scan.nextInt();
                    if (number == guess) {
                        System.out.println("Winner!");
                    } else {
                        System.out.println("Your number is " + ((guess > number) ?
                                "greater" : "less."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Errrrrorrrrrrr");
                    scan.next();
                }
            }
            if (count == 3)
                System.out.println("Looser");
            System.out.print("Try again? 1 – yep / 0 – nope ");
        } while (scan.next().equals("1"));
    }

    static void TaskWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess;
        String word = words[rand.nextInt(words.length)];
        System.out.println(Arrays.toString(words));
        do {
            System.out.print("Try to guess a word ");
            guess = scan.next();
            for (int i = 0; i < 15; i++)
                if (i < word.length() && i < guess.length() &&
                        word.charAt(i) == guess.charAt(i))
                    System.out.print(word.charAt(i));
                else
                    System.out.print((word.equals(guess)) ? "" : "*");
            System.out.println();
        } while (!word.equals(guess));
    }
}