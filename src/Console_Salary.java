
import java.util.Scanner;

public class Console_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scan.nextLine();
        System.out.println("Введите возраст:");
        int age = scan.nextInt();
        System.out.println("Введите оклад:");
        double salary = scan.nextDouble();
        double annualSalary = salary * 12;
        System.out.printf("Имя %s, возраст %d, оклад %f, годовой доход %f", name, age, salary, annualSalary);
    }
}
