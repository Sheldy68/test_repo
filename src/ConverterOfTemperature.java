import java.util.Scanner;

public class ConverterOfTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите единицы измерения (F,K):");
        String measure = scanner.next();
        System.out.println("Введите единицы измерения (F,K):");
        double value = scanner.nextInt();
        double result = 0;
        if (measure.equals("F")) {
            result = (value - 32) / 1.8;
        } else {
            if (measure.equals("K")) {
                result = value + 273;
            } else {
                System.out.println("Ошибка ввода единиц измерения");
            }
        }
        System.out.println("Результат в цельсиях: " + result);
    }
}
