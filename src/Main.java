import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет!:");
        String color = scanner.nextLine();

        switch (color) {
            case "red":
                System.out.println("Остановись!");
                break;
            case "yellow":
                System.out.println("Подождать");
                break;
            case "green":
                System.out.println("Ехать!");
                break;
            default:
                System.out.println("Некорректный цвет");
        }
    }
}
