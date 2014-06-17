public class Obvious {

    private int a;

    private short b;

    public Obvious(int a, short b) {
        this.a = a;
        this.b = b;
    }

    public int hashCode() {
        return 31 * a + (int) b;
    }
}
