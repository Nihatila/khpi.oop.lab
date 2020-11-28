package khpi.oop.lab.safarli01;

public class Main {
    public static void main(String[] args){
        int zhachotka = 0x9872E8;
        long number = 380668386140L;
        int num2 = 0b1110;
        int num4 = 020646;
        int ost = 1 + (26 % (20 - 1));
        String letter = "H";
        count(zhachotka);
        //findo(num2);
    }
    static int findo(int i){
        int count = 0;
        for(; i > 0; count++){
            i &= i - 1;
        }
        System.out.println("Количество единиц - " + count);
        return count;
    }
    static void count(int n){
        int even,odd;
        System.out.println(n);
        even = 0;
        odd = 0;
        while (n>0) {
            if (n%2 == 0){
                even += 1;
            }
            else{
                odd += 1;
            }
            n = n/10;
        }
        System.out.println("Количество четных - " + even + " Количество нечетных - " + odd);

    }
}
