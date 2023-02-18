import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secInStep = 10;
        int floor;
        int stepInStraight = 15;
        int straightInFloor = 2;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет понять насколько секунд увеличилась ваша жизнь: ");

        System.out.print("Введите номер этажа на который вы хотите подняться: ");

        floor = scanner.nextInt();

        result = secInStep * stepInStraight * floor * straightInFloor;

        System.out.println("Жизнь увеличится на " + result + " секунд");

    }
}