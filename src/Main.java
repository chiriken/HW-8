import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1 //

        int[] tally = {433521, 41154, 536234, 243095, 1};

        int total =0;
        for (int i = 0; i < tally.length; i++){
            total += tally[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " руюблей");

        // task 2 //

        int min = tally[0];
        int max = tally[1];


        for (int i = 0; i < tally.length; i++) {
            if (tally[i] < min){
                min = tally[i];
            }
            if (tally[i] > max){
                max = tally[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");

        // task 3 //

        double total1 = (double) total / tally.length;
        System.out.println("Средняя сумма трат за месяц составила " + total1 + " рублей");

        // task 4 //

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
         int oneInedex = i;
         int lastIdex = reverseFullName.length - i -1;

         char tmp = reverseFullName[oneInedex];
         reverseFullName[oneInedex] = reverseFullName[lastIdex];
         reverseFullName[lastIdex] = tmp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }






    }
}