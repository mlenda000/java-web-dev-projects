import java.util.ArrayList;
public class SumEven {
    public static int sum(ArrayList<Integer> arr){
        int answer=0;
        for (int integer : arr){
            if (integer % 2 == 0){
                answer += integer;
            }
        }
        return answer;
    }
}

