public class Lite {

    public int count;

    private Lite(int a){
        count = a;
    }

    public static Lite getInstance(int count){
        return new Lite(count * 10);
    }

    public int getCount() {
        return count;
    }

}
