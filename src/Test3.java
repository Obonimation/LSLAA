import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лиза пахнет жопами?");
        String value = scanner.nextLine();
        while (!"Да".equalsIgnoreCase(value)){
            System.out.println("неверно");
            value = scanner.nextLine();
        }
        System.out.println("Верно :)");

    }
}
