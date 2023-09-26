import java.util.Scanner;
public class FavoriteDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite day?");
        String day = scanner.nextLine();
        System.out.printf("%s is your favorite day!", day);
    }
}
