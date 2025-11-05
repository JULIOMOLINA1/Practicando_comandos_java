package pe.edu.tecsup.app;

import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {

        String word1, word2;
        Scanner input =new Scanner(System.in);

        //Entering data
        System.out.println("Enter the first word: ");
        word1 = input.nextLine();
        System.out.println("Enter the second word: ");
        word2 = input.nextLine();

        //Compare data
        if(word1.equals(word2)){
            System.out.println(word1 + " es igual a " + word2);
        } else{
            System.out.println(word1 + " no es igual a "+ word2);
        }
        //Compare strings ignoring case
        if(word1.equalsIgnoreCase(word2)){
            System.out.println(word1 + " es igual a " + word2);
        } else{
            System.out.println(word1 + " no es igual a "+ word2);
        }
        //Compare in alphabetical order
        if(word1.compareTo(word2)==0){
            System.out.println(word1 + " has the same alphabetical order " + word2);
        } else{
            if(word1.compareTo(word2)>0){
                System.out.println(word1 + " has a greater alphabetical order than " + word2);
            } else{
                System.out.println(word1 + " has a lower alphabetical order than " + word2);
            }
        }
        //Determine the order of characters in a word
        char character = word1.charAt(0);
        System.out.println("The character with order 0 in the word is the letter: " + character);

        System.out.println(word2.charAt(3));
        //Determine the number of characters of a string
        System.out.println("The number of characters of "+word1 + " is:  "+word1.length());
        //Identify a range of characters of a string or word
        System.out.println("The first 3 letters of: "+word2 + " are: "+word2.substring(0,3));
        //Find matching characters in two words
        int coincidence=word1.indexOf(word2);
        if(coincidence==-1){
            System.out.println(word1 + " doesn't have matching characters with "+word2);
        } else{
            System.out.println(word1 + " has matching characters with "+word2);
        }
        //to transform the strings to uppercase
        System.out.println(word1.toUpperCase());
        //to transform the words to lowercase
        System.out.println(word2.toLowerCase());
    }
}
