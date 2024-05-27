import java.util.Scanner;

public class LogicOperations {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        if (a!=b) {
            System.out.println("a не равно b");
        }
        //ля сравнения чисел дополнительно существуют операторы >, >=,<=,<.
        double c = 0;
        int d = 10;
        if (c<d) {
            System.out.println("c меньше d");
        }
        /*
        Результат логического выражения имеет тип boolean. Этот тип данных специально создан для хранения информации
         о верности какого-либо утверждения. Переменные этого типа могут иметь значения: true или false.
         */
        double aa = 0;
        int bb = 10;
        boolean result = aa < bb;
        if (result) {
            System.out.println("aa меньше bb");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100:");
        int a1 = scanner.nextInt();
        /*
        Если переменная «a» меньше 0, то условие a>=0 ложно и можно перейти к ложному сценарию сразу,
        нет необходимости проверять вторую часть условия a<=100. При одинарном же операторе все части условия пройдут
        проверку, независимо от их значений, и только потом сформируется результат.
         */
        if (a1>=0 && a1<=100) {
            System.out.println("Значение корректно");
        } else {
            System.out.println("Значение некорректно");
        }
        /*
        (Делится на 4) ИЛИ (Делится на 100 И Делится на 400). С помощью такого выражения мы можем проверить любой год
        на високосность.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scan.nextInt();
        if (year%4 == 0 || (year%100==0 && year%400==0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не является високосным годом");
        }
        /*
        Возраст. Для зданного 0 < n < 100, рассматриваемого как возраст человека,
        вернуть строку вида: "21 год", "32 года", "12 лет".
        Если число заканчивается на 1, то "год".
        Если на 2,3,4, то "года".
        Если на 5,6,7,8,9, то "лет".
        С 11 по 19 лет
         */
        Scanner scanAge = new Scanner(System.in);
        System.out.println("Введите сколько Вам лет:");
        int yearsOld = scanAge.nextInt();
        if (yearsOld % 100 >= 11 && yearsOld % 100 <= 19) {
            System.out.println(yearsOld + " лет");
        } else {
            if (yearsOld % 10 == 1) {
                System.out.println(yearsOld + " год");
            }
            if (yearsOld % 10 >= 2 && yearsOld % 10 <= 4) {
                System.out.println(yearsOld + " годa");
            }
            if (yearsOld % 10 == 0 || yearsOld % 10 >= 5 && yearsOld % 10 <= 9) {
                System.out.println(yearsOld + " лет");
            }
        }
        /*
        На шахматной доске стоит черный король и две белые ладьи (ладья бьет по горизонтали и по вертикали).
        Определить, не находится ли король под боем, и если есть угроза, то от кого именно.
        Вернуть 0, если угрозы нет, 1, если угроза только от первой ладьи, 2, если только от втрой ладьи,
        и 3, если угроза от обеих ладей.
        Считать, что ладьи не могут загораживать (быть на одной клетке) друг друга.
         */
        int rook1X = 0;
        int rook1Y = 0;
        int rook2X = 1;
        int rook2Y = 2;
        int kingX  = 2;
        int kingY  = 2;
        if ((kingX == rook2X || kingY == rook2Y) && (kingX == rook1X || kingY == rook1Y)) {
            System.out.println("3");
        } else if (kingX == rook1X || kingY == rook1Y) {
            System.out.println("1");
        } else if (kingX == rook2X || kingY == rook2Y) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
