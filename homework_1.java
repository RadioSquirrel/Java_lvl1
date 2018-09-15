/**
 * Plieva Maya. Homework_1
 */

public class homework_1 {
    public static void main(String[] args) {
        ChapterOne();
        System.out.println("a * (b + (c / d)) = " + ChapterTwo(1,2,3,4));
        System.out.println(ChapterThree(5,6));
        ChapterFour(12);
        System.out.println(ChapterFive(-15));
        ChapterSix("Kitty");
        ChapterSeven(1984);
    }

    static void ChapterOne() {
        byte bt;
        bt = 123;
        short st;
        st = 13000;
        int it = -200000;
        long lg = 26000L;
        float ft;
        ft = 298.9f;
        double dl = 285.397;
        boolean bl = true;
        char c = 'M';
        System.out.println("byte = " + bt);
        System.out.println("short = " + st);
        System.out.println("int = " + it);
        System.out.println("long = " + lg);
        System.out.println("float = " + ft);
        System.out.println("double = " + dl);
        System.out.println("boolean = " + bl);
        System.out.println("char = " + c);
    }

    static double ChapterTwo(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    static boolean ChapterThree(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20)
            return true;
        else
            return false;
    }

    static void ChapterFour(int a) {
        if (a >= 0)
            System.out.println("Positive number: " + a);
        else
            System.out.println("Negative number: " + a);
    }

    static boolean ChapterFive(int a) {
        return a < 0;
    }

    static void ChapterSix(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void ChapterSeven(int y) {
        if (y % 4 == 0) {
            if ((y % 100 != 0) || (y % 400 == 0)) {
                System.out.println(y + " is leap year");
            }
        } else
            System.out.println(y + " is not a leap year");
    }

}