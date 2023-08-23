import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      //Array practice
       int[] newArray = {1,1,2,3,5,8};
       for (int i : newArray){
           if(i%2 == 0){
               continue;
           }else {
               System.out.println(i);
           }
       }
       String rhyme = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
       String[] stringArray = rhyme.split("\\.");
       System.out.println(Arrays.toString(stringArray));

//Arraylist practice
 ArrayList<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    intList.add(4);
    intList.add(5);
    intList.add(6);
    intList.add(7);
    intList.add(8);
    intList.add(9);
    intList.add(10);

    int answer = SumEven.sum(intList);
    System.out.println("The sum of all the even numbers in the arraylist is: " + answer);

ArrayList <String> strList = new ArrayList<>();
    strList.add("dog");
    strList.add("monkey");
    strList.add("sloth");
    strList.add("cat");
    strList.add("bear");
    strList.add("snake");
    strList.add("turtle");
    strList.add("rabbit");
    strList.add("fish");
    strList.add("lizard");

System.out.println(FiveLetters.words(strList));

     }
}