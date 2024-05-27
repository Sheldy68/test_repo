import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = scanner.next();

        /*
            Оператор break необходим, когда нужно выполнить разные действия для разных значений.
            В данном случае, для значений «понедельник»-«пятница» мы выполняем одно действие — выводим на консоль
            «будний день», поэтому оставляем блок кода только для case(”пятница”), для значений «суббота»-«воскресенье»
             — выводим на консоль «выходной день» и оставляем блок кода case(”воскресенье”).
        */
        switch (day) {
            case ("понедельник"):
            case ("вторник"):
            case ("среда"):
            case ("четверг"):
            case ("пятница"): {
                System.out.println("будний день");
                break;
            }
            case ("суббота"):
            case ("воскресенье"): {
                System.out.println("выходной день");
                break;
            }
            default: {
                System.out.println("Не корректный ввод");
            }
        }
        /*
        получить строковую нотацию для оценки по пятибальной системе
         */
        System.out.println(graduate(5));
    }
    private static String graduate(Integer num) {
        switch (num) {
            case (5):
                return "Отлично";
            case (4):
                return "Хорошо";
            case (3):
                return "Удовлетворительно";
            case (2):
                return "Плохо";
            default:
                return "Оценка не известна";
        }
    }
}

