import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Climber test = new Climber();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину маршрута: ");
        int length = in.nextInt();
        test.setLength(length);
        test.printRoute();
    }
}