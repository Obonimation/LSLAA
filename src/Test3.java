import java.util.Scanner;

public class Test3 {
    private static final String QUESTION = "Лиза пахнет жопами?";
    private static final String CORRECT_ANSWER = "Да";
    private static final String INCORRECT_OUTPUT = "неверно";
    private static final String CORRECT_OUTPUT ="Верно :)";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(QUESTION);
        String value = scanner.nextLine();
        while (!"Даa".equalsIgnoreCase(value)){
            System.out.println("неверно");
            value = scanner.nextLine();
        }
        System.out.println(CORRECT_OUTPUT);

    }
}
