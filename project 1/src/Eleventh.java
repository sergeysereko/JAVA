
/*Задание 11
Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
Метод принимает в качестве параметра: длину линии,
направление, символ.*/
import java.util.Scanner;
public class Eleventh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите длину линии: ");
        int length = scanner.nextInt();

        System.out.print("Введите направление \n" +
                "horizontal - введите h\n" +
                " vertical - введите v): ");
        String direction = scanner.next();

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);


        drawLine(length, direction, symbol);


        scanner.close();
    }

    static void drawLine(int length, String direction, char symbol) {
        if ("h".equalsIgnoreCase(direction)) {
            drawHorizontalLine(length, symbol);
        } else if ("v".equalsIgnoreCase(direction)) {
            drawVerticalLine(length, symbol);
        } else {
            System.out.println("Некорректное направление. Используйте 'h' или 'v'.");
        }
    }

    static void drawHorizontalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol); // на одной строке
        }
    }

    static void drawVerticalLine(int length, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol); // на новой строке
        }
    }
}
