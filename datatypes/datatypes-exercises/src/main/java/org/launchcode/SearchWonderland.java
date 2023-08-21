package org.launchcode;
import java.util.Scanner;
public class SearchWonderland {
    public static void main(String[] args) {
    String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
            "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
            "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
    Scanner input = new Scanner(System.in);
    System.out.println("What word would you like to search for?");
    String word = input.nextLine();
    input.close();
    boolean found;
    found = alice.toLowerCase().contains(word.toLowerCase());
    int index = alice.toLowerCase().indexOf(word.toLowerCase());
    int length = word.length();
    if (found) {
        System.out.println("The string contained the word ("+word+") you entered.");
        System.out.println("Your word firs appears at index "+index+". And is "+length+" characters long.");
        String newAlice = alice.toLowerCase().replace(word, "");
        System.out.println("The sentence with the word "+word+" removed:");
        System.out.println(newAlice);
    }else{
        System.out.println("The String did not contain the word ("+word+") you entered.");
    }


    }
}
