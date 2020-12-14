package khpi.oop.lab.safarli04;

import java.util.Scanner;

public class Main {
    public static boolean volt = false;

    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        System.out.println("Добро пожаловать!");
        System.out.println("Вас приветствует проограмма для замены в тексте каждой буквы ее номером в алфавите.");
        System.out.println("Выберите один из пунтков: ");
        mini();
    }

    static void mini(){
        System.out.println("1. Ввод данных.");
        /*
            Вот текст, если не хотите вводить большое кол-во символов:
            Meet my family. There are five of us – my parents, my elder brother, my baby sister and me.
            First, meet my mum and dad, Jane and Michael.
        */
        System.out.println("2. Просмотр данных.");
        System.out.println("3. Выполнение замены.");
        System.out.println("4. Вывод результата.");
        System.out.println("5. Завершение программы.");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch (i){
            case 1:
                Helper.input();
                System.out.println("Сделано!");
                System.out.println("Что бы вы хотели сделать дальше?");
                mini();
                break;
            case 2:
                Helper.data();
                System.out.println("Сделано!");
                System.out.println("Что бы вы хотели сделать дальше?");
                mini();
                break;
            case 3:
                volt = true;
                System.out.println("Выполненяется замена......");
                System.out.println("Готово!");
                System.out.println("Что бы вы хотели сделать дальше?");
                mini();
                break;
            case 4:
                if(volt == false){
                    System.out.println("Для того чтобы получить результат задания, вы должны его сначала выполнить!");
                }else {
                    Helper.output();
                    System.out.println("Сделано!");
                    System.out.println("Что бы вы хотели сделать дальше?");
                }
                mini();
                break;
            case 5:
                System.out.println("Будет сделано!");
                System.out.println("Сасибо за использование! До встречи!");
                System.exit(0);
                break;
            default:
                System.out.println("Ошибка!");
                System.out.println("Введите число от 1 до 5!");
                mini();
                break;
        }
    }

}
