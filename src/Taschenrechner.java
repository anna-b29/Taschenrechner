import java.util.Scanner;

public class Taschenrechner {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("### Mini Taschenrechner ###");

        double zahl1 = frageNachZahl("Gib die erste Zahl ein: ");
        String operator = frageNachOperator();
        double zahl2 = frageNachZahl("Gib die zweite Zahl ein: ");
        double ergebnis = berechne(zahl1, zahl2, operator);
        System.out.println("Ergebnis: " + ergebnis);

        scanner.close();
    }

    /**
     * Fragt nach einer Zahl.
     * 
     * @param nachricht Die Nachricht, die angezeigt wird.
     * @return
     */
    private double frageNachZahl(String nachricht) {
        System.out.print(nachricht);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben. ");
            scanner.next();
            System.out.println(nachricht);
        }
        return scanner.nextDouble();
    }

    /**
     * Fragt nach dem Operator.
     * 
     * @return Den Operator
     */
    private String frageNachOperator() {
        System.out.print("Bitte wähle einen Operator (+, -, *, /): ");
        String op = scanner.next();
        while (!op.matches("[+\\-*/]")) {
            System.out.println("Ungültiger Operator. Es sind +, -, * und / erlaubt.");
            op = scanner.next();
        }
        return op;
    }

    /**
     * Berechnet die Rechnung. Bei der Division mit 0 wird ein Fehler angezeigt.
     * 
     * @param a  Erste Zahl
     * @param b  Zweite Zahl
     * @param op Operator
     * @return Das Ergebnis der Rechnung
     */
    private double berechne(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (a == 0 || b == 0) {
                    System.out.println("Fehler: Division durch 0 nicht erlaubt!");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Unbekannter Fehler.");
                return 0;
        }
    }

    public static void main(String[] args) {
        new Taschenrechner().start();
    }
}
