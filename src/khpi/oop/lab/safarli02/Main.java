package khpi.oop.lab.safarli02;

public class Main {

    static int num = 0;
    static int oz = 0;
    static int zo = 0;

    public static void main(String[] args) {
        horiz_line();
        header();
        horiz_line();
        for (int ui = 0; ui < 10; ui++) {
            num = 10 + (int) (Math.random() * 90);
            oz = 0;
            zo = 0;
            count();
            print();
        }
    }

    static void print() {
        String number = Integer.toBinaryString(num);
        System.out.printf("%s%7d", "|", num);
        System.out.printf("%6s%9d", "|", oz);
        System.out.printf("%9s%9d", "|", zo);
        System.out.printf("%9s%8s%4s%n", "|", number, "|");
        horiz_line();
    }

    static void header() {
        System.out.printf("%s%11s%2s", "|", "число в 10", "|");
        System.out.printf("%16s%2s", "комбинации \"10\"", "|");
        System.out.printf("%16s%2s", "комбинации \"01\"", "|");
        System.out.printf("%10s%2s%n", "число в 2", "|");
    }

    static void horiz_line() {
        System.out.print("+");
        for (int bdb = 0; bdb < 12; bdb++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int bdb = 0; bdb < 17; bdb++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int bdb = 0; bdb < 17; bdb++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int bdb = 0; bdb < 11; bdb++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    static void count() {
        int number = num;
        int s = 0;
        int c = 0;
        for (int v = 0; number != 0; v++) {
            if (v < 1) {
                s = number % 2;
                int s1 = 0;
                if (s != 0) {
                    s1 = (number - 1) / 2;
                } else {
                    s1 = number / 2;
                }
                number = s1;
            }
            c = number % 2;
            int s2 = 0;
            if (c != 0) {
                s2 = (number - 1) / 2;
            } else {
                s2 = number / 2;
            }
            number = s2;
            check(s, c);
            s = c;
        }
        int temp = oz;
        oz = zo;
        zo = temp;
    }

    static void check(int a, int b) {
        if (a == 1) {
            if (b == 0) {
                oz++;
            }
        }
        if (a == 0) {
            if (b == 1) {
                zo++;
            }
        }
    }
}
