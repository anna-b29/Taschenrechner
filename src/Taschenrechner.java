import java.util.Scanner;

public class Taschenrechner {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("### Mini Taschenrechner ###");

    }

    private double frageNachZahl(String nachricht) {
        System.out.print(nachricht);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben. ");
            scanner.next();
            System.out.println(nachricht);
        }
        return scanner.nextDouble();
    }

    private String frageNachOperator() {
        return "";
    }

    private String berechne(double a, double b, String op) {
        return "";
    }

    public static void main(String[] args) {
        new Taschenrechner().start();
    }
}
