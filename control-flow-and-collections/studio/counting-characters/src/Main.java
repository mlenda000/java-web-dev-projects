import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        FileReader fr = new FileReader("src/string.txt");
        String str = "";
        int i;
        while((i = fr.read()) != -1){
            str += (char)i;
        }
//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> count = new HashMap<>();
            for(char c: chars) {
                if (c != ' ') {
                    if (count.containsKey(c)) {
                        count.put(c, count.get(c) + 1);
                    } else {
                        count.put(c, 1);
                    }
                }
            }
        System.out.println(str);
            for(Map.Entry entry : count.entrySet()){
                System.out.println("Number of appearances of " +entry.getKey()+ " = "+ entry.getValue());
            }
    }
}