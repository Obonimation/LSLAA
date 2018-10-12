public class Comparison {
    public static int min(int a, int b, int c) {
        if (a < b) {
            if (c < b) {
                if (a < c) {return a;}
                else return c;}
            else return a;}
        else if (b < c) {return b;}
        else return c;
            }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 1));
        System.out.println(min(5, 7, 10));
    }

}