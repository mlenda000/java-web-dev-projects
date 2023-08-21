import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetters {
    public static ArrayList<String> words(ArrayList<String> arr){
        ArrayList<String> fiveLetters = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 6:");
        int wordLength = input.nextInt();
        for(String i : arr){
            if (wordLength == i.length()){
                fiveLetters.add(i);
            }

        }
        return fiveLetters;

    }
}
