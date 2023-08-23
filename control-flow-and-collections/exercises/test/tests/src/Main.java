public class HelloWorld{

    public static void main(String []args){
        String food ="Foodie";
        for(int i = 0; i<food.length();i++){
            if (food.charAt(i) == 'o'){
                System.out.println("Found it at " + i);
                break;
            }
        }
    }
}