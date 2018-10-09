import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лиза пахнет жопами?");
        String value = scanner.next();
        while(!value.equals("Да")){
        System.out.println("Неверно");
            value = scanner.next();}
        System.out.println("Верно :)");

    }
}
