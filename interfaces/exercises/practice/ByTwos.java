import org.w3c.dom.ls.LSOutput;

public class ByTwos implements Series{
    private int val;

    public ByTwos(int val) {
        this.val = val;
    }

    public int getNext() {
        this.val += 2;
        return this.val;
    }
}
