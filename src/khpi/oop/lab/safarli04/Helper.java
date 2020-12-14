package khpi.oop.lab.safarli04;

import java.util.Scanner;

public class Helper {
    public static String str = "";

    public static void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите предложение - ");
        str = input.nextLine();
    }

    public static void data() {
        System.out.println("Введенное предложение:");
        System.out.println(str);
    }

    public static void output(){
        char str_arr[] = str.toCharArray();
        for (int f = 0; f < str_arr.length; f++){
            char point = str_arr[f];
            System.out.printf("%3s", point);
        }
        System.out.println();

        String abc = " abcdefghijklmnopqrstuvwxyz";
        String copy = str.toLowerCase();
        StringBuffer buf_str = new StringBuffer(copy);
        for (int i = 0; i < buf_str.length(); i++) {
            char word = buf_str.charAt(i);
            int num = abc.indexOf(word);
            if (num == -1) {
                System.out.printf("%3s", word);
            } else {
                if (word == ' ') {
                    System.out.print("   ");
                } else {
                    System.out.printf("%3d", num);
                }
            }
        }
    }
}