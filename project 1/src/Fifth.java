import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int numberMonth = scanner.nextInt();

        if(numberMonth >= 1 && numberMonth <= 2 || numberMonth == 12) {
            System.out.println("Winter");
        }
        else if(numberMonth >= 3 && numberMonth <= 5){
            System.out.println("Spring");
        }
        else if (numberMonth >= 6 && numberMonth <= 8) {
            System.out.println("Summer");
        }
        else if (numberMonth >= 9 && numberMonth <= 11) {
            System.out.println("Autumn");
        }
        else {
            System.out.println("Error");
        }

    }

}
