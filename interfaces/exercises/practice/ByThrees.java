public class ByThrees implements Series{
    private int val;

    public ByThrees(int val) {
        this.val = val;
    }

//    @Override
    public int getNext() {
        this.val += 3;
        return this.val;
    }
}
