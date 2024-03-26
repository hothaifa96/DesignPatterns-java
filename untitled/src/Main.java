import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if (a > b && a >= c){
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
