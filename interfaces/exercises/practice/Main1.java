public class Main1 {
    public static void main(String[] args) {

        ByTwos bt = new ByTwos(0);
        ByThrees bts = new ByThrees(0);
        Series ob;
        ob = bts;

        for (int i=0;i<5;i++) {
            System.out.println(bt.getNext());
        }
        for (int i=0;i<7;i++) {
            System.out.println(bts.getNext());
        }


    }
}
