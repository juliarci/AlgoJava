import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Saisissez deux nombres");
        saisirNbr();
    }

    private static void saisirNbr() {
        Scanner sc = new Scanner(System.in);
        int nombre1 = Integer.parseInt(sc.next());
        int nombre2 = Integer.parseInt(sc.next());
        if (nombre2 > nombre1) {
            System.out.println("Le nombre maximum est :" + nombre2);
        } else {
            System.out.println("Le nombre maximum est :" + nombre1);
        }
    }
}
