package khpi.oop.lab.safarli03;

import java.util.Scanner;

public class Helper {
    /**
     * Статичний метод який буде вирішувати індивідуальне завдання.
     */
    public static void method() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите предложение - ");
        /*
            Вот текст, если не хотите вводить большое кол-во символов:
            Meet my family. There are five of us – my parents, my elder brother, my baby sister and me.
            First, meet my mum and dad, Jane and Michael.
        */
        String str = input.nextLine();
        /**
         * @param str змінна в якій зберігається введений текст.
         * @param str_arr масив символів введеного тексту.
         */
        char str_arr[] = str.toCharArray();
        for (int f = 0; f < str_arr.length; f++){
            char point = str_arr[f];
            System.out.printf("%3s", point);
        }
        System.out.println();
        /**
         * @param abc всі латинські символи для перевірки тексту.
         * @param copy змінна з введеним текстом в ніжнепм регістрі.
         * @param word змінна з символом під номером i з введеного тексту.
         * @param num змінна для перевірки чи є символ розділяє знаком пунктуації.
         */
        String abc = " abcdefghijklmnopqrstuvwxyz";
        String copy = str.toLowerCase();
        StringBuffer buf_str = new StringBuffer(copy);
        for(int i = 0; i < buf_str.length(); i++){
            char word = buf_str.charAt(i);
            int num = abc.indexOf(word);
            if(num == -1){
                System.out.printf("%3s", word);
            }else {
                if (word == ' ') {
                    System.out.print("   ");
                } else {
                    System.out.printf("%3d", num);
                }
            }
            /**
             * Перевірка чи є символ розділяє знаком пунктуації.
             */
        }


    }
}