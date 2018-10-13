public class Comparison {
    public static int min(int a, int b, int c, int d) {
        int e = min(min(a, b), min(c, d));
        return e;
    }
    public static int min(int a, int b, int c) {
        if (a < b) {
            if (c < b) {
                if (a < c) {return a;}
                else return c;}
            else return a;}
        else if (b < c) {return b;}
        else return c;
            }
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2));
        System.out.println(min(-2, -3));
        System.out.println(min(7, 5, 3));
        System.out.println(min(3, 5, 1));
        System.out.println(min(5, 7, 10));
        System.out.println(min(1,2,3,4));
        System.out.println(min(4,3,2,1));
        System.out.println(min(1,4,-2,0));
        System.out.println(min(-1,-7,0,6));
    }

}