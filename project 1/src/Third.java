import java.util.Scanner;
public class Third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String firstNumber = scanner.next();
        String trimFirstNumber = firstNumber.trim();

        System.out.print("Введите второе число: ");
        String secondNumber = scanner.next();
        String trimSecondNumber = secondNumber.trim();

        System.out.print("Введите третье число: ");
        String thirdNumber = scanner.next();
        String trimThirdNumber = thirdNumber.trim();

        String union = trimFirstNumber + trimSecondNumber + trimThirdNumber;

        int result = Integer.parseInt(union);

        System.out.println("Ваше число - "+ result);

        scanner.close();
    }
}
