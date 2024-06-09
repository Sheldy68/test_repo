import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //1000 1003 1006 1009 вывести числа от 1000 с шагом 3
//        for (int i = 1000; i <= 9999; i = i + 3) {
//            System.out.println(i);
//        }

        //1 3 5 7 вывести нечетные числа, прогнать цикл 15 раз. Последнее число будет 29
//        for (int i = 0, a = 1; i < 15; i = i + 1, a = a + 2) {
//            System.out.println(a);
//        }

        // 90 85 80 цикл на уменьшение
//        for (int i = 90; i >=0; i = i - 5) {
//            System.out.println(i);
//        }

        // перебрать значения в цикле, найти максимальное значение
//        int[] values = {6, 7, 9, 5, 3, 4};
//        int maxValue = values[0]; //исходное макс значение = первому значению в массиве
//        //for each цикл
//        for (int v : values) {
//            if (v > maxValue) {
//                maxValue = v;
//            }
//        }
//        System.out.println(maxValue);

//        List<String> names = List.of("Ira","Olya", "Vasya");
//        for (String name : names) {
//            System.out.println(name);

        // пока счетчик <= 15 вывести счетчик
//        int i = 1;
//        while (i <= 15) {
//            System.out.println(i);
//            i++; // i = i + 1
//        }

        // возводить в степень, пока не будет = 64
//        int pow = 2;
//        int res = 1;
//        while (res <= 64) {
//            res = res * pow;
//            if (res == 8) { // не выводить число 8
//                continue;
//            }
//            System.out.println(res);
        // результат
//            2
//            4
//            16
//            32
//            64
//            128

//            int pow = 2;
//            int res = 1;
//            while (true) {           // выполнять пока не дойдем до 32
//                res = res * pow;
//                if (res == 32) {     // не выводить число 8
//                    break;
//                }
//                System.out.println(res);
//        }
        // результат
//                2
//                4
//                8
//                16

        //ввести положительное число и найти корень из него
//        Scanner scan = new Scanner(System.in);
//        double res = 0;
//        int num = scan.nextInt();
//        while (num < 0) {
//            System.out.println("Неверное число. Попробуй опять");
//            num = scan.nextInt();
//        }
//            res = Math.sqrt(num);
//        System.out.println(res);


        // цикл do while
//        int pow = 3;
//        int res = 3;
//        do {
//            System.out.println(res);
//            res = res * pow;
//        } while (res < 500);
        // результат
//        3
//        9
//        27
//        81
//        243
        // если } while (res < 2); то все-равно выполнит хотя бы 1 раз
        // результат
//        3

        Scanner scan = new Scanner(System.in);
        int ans = 0;
        System.out.println("Сколько будет 3 * 5?");
        do {
            ans = scan.nextInt();
            if (ans == 15) {  //если верно, то выйти из цикла
                System.out.println("Поздравляю!");
                break;
            }
            System.out.println("Неверно. Попробуй опять");
        } while (true); //пока не случился Break
    }
}
