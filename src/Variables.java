import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        byte b = 1;
        b = (byte) (b + 127); //получится -128
        System.out.println(b);
        /*при компиляции Java, любое число в коде считает по умолчанию int. Надо в конце добавить «L» - long
        long l = 9_000_000_000
        */
        long l = 9_000_000_000L;
        System.out.println(l);
        /*
        для целых чисел Java считает по умолчанию все int, то в случае с вещественными числами Java считает все double.
        Нужно добавить символ F в конце
         */
        float f = 3.04f;
        System.out.println(f);
        /*
        Существуют специальные операции для логических значений
            ! — отрицание
            & — логическое умножение
            | - логическое сложение
            Отрицание возвращает обратное значение
         */
        //Земля круглая
        boolean b1 = true;
        System.out.println("b1 - " + b1); //true
        System.out.println("!b1 - " + !b1); //false
        /*
        Логическое сложение и умножение используется с двумя логическими переменными.
        Умножение будет истинно, если обе переменные истинны, в остальном результат будет ложный.
         */
        boolean b2 = false;
        boolean result1 = b1&b2;
        boolean result2 = !b1&b2;
        boolean result3 = b1&!b2;
        boolean result4 = !b1&!b2;
        System.out.println("b1&b2 = " + result1); //false
        System.out.println("!b1&b2 = " + result2); // false
        System.out.println("b1&!b2 = " + result3); //true
        System.out.println("!b1&!b2 = " + result4); //false
        //Сложение будет ложно, если обе переменные ложны. В остальных случаях будет истинно.
        boolean result5 = b1|b2;
        boolean result6 = !b1|b2;
        boolean result7 = b1|!b2;
        boolean result8 = !b1|!b2;
        System.out.println("b1|b2 = " + result5); //true
        System.out.println("!b1|b2 = " + result6); //false
        System.out.println("b1|!b2 = " + result7); //true
        System.out.println("!b1|!b2 = " + result8); //true
        //символьная переменная
        char a1 = 'А'; //в двойных кавычках будет string
        char a2 = 97;  //символ 'а' в формате ЮНИКОД
        System.out.println("a1 - " + a1);
        System.out.println("a2 - " + a2);
        // работа со стрингом
        String s = "Hello World!";
        System.out.println("Размер строки - " + s.length());
        System.out.println("Поиск символа - " + s.indexOf('W'));
        System.out.println("Взятие подстроки - " + s.substring(6));
        System.out.println("Замена символа - " + s.replace(' ', '_'));
        System.out.println("Возведение в верхний регистр - " + s.toUpperCase());
        System.out.println("Возведение в нижний регистр - " + s.toLowerCase());

        final int LIMIT_AGE = 5; //константы с большой буквы и _, если слов несколько

        int num1 = 10;
        int num2 = 20;
        int average = (num1 + num2) /2;
        System.out.println("Среднее значение 10 + 20 = " + average);
        //площадь круга
        final double PI = Math.PI;
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите радиус:");
        double r = scan.nextDouble();
        double circS = PI * Math.pow(r,2); //во 2 степени
        System.out.println("Площадь круга = " + circS);
    }
}
