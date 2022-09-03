package word;

import java.util.Scanner;

public class WordChangeCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;

        // Enter word and press Enter
        System.out.println("Enter your word to change case: ");
        text = sc.nextLine();

        // Result
        System.out.println("");
        System.out.println("Your Word: " + text);
        System.out.println("Your Word in Lowercase: " + text.toLowerCase());
        System.out.println("Your Word in Uppercase: " + text.toUpperCase());
        System.out.println("Your Word in Titlecase: " + text.toUpperCase().charAt(0) + text.toLowerCase().substring(1, text.length()));
        System.out.println("Your Word in last Uppercase: " + text.toLowerCase().substring(0, text.length()-1) + text.toUpperCase().charAt(text.length()-1));

        char[] letterArray = text.toCharArray();
        for (int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] == Character.toUpperCase(letterArray[i])) {
                letterArray[i] = Character.toLowerCase(letterArray[i]);
            } else {
                letterArray[i] = Character.toUpperCase(letterArray[i]);
            }
        }
        System.out.println("Your Word in Invertcase: " + new String(letterArray));

        letterArray = text.toCharArray();
        for (int i = 0; i < letterArray.length; i++) {
            if (i % 2 == 1) {
                letterArray[i] = Character.toLowerCase(letterArray[i]);
            } else {
                letterArray[i] = Character.toUpperCase(letterArray[i]);
            }
        }
        System.out.println("Your Word in odd Uppercase and even Lowercase: " + new String(letterArray));

        letterArray = text.toCharArray();
        for (int i = 0; i < letterArray.length; i++) {
            if (i % 2 == 0) {
                letterArray[i] = Character.toLowerCase(letterArray[i]);
            } else {
                letterArray[i] = Character.toUpperCase(letterArray[i]);
            }
        }
        System.out.println("Your Word in odd Lowercase and even Uppercase: " + new String(letterArray));

    }

}
