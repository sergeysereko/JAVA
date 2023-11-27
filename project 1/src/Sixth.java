import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();

        System.out.print("В какаю единицу измерения Вы хотите переветси?\n" +
                "\tв мили - кнопка 1\n" +
                "\tв дюймы - кнопка 2\n" +
                "\tв ярды - кнопка 3\n");
        int selectButton = scanner.nextInt();

        if(selectButton == 1)
        {
            double miles = meters * 0.000621371;
            System.out.println("Количество миль - " + miles);
        }
        else if (selectButton == 2) {
            double inches = meters * 39.3701;
            System.out.println("Количество дюймов - " + inches);
        }
        else if (selectButton == 3) {
            double yards = meters * 1.09361;
            System.out.println("Количество ярдов - " + yards);
        }
        else {
            System.out.println("Erorr");
        }

    }
}
