import java.util.Scanner;

public class Exercice7 {

    public static void main(String[] args) {
        System.out.println("Saisissez un nombre");
        saisirNbr();
    }

    private static void saisirNbr() {
        Scanner sc = new Scanner(System.in);
        int nbr = Integer.parseInt(sc.next());
        for (int i = 0; i <= nbr; i++) {
            int pair = (i % 2);
            if (pair == 0) {
                System.out.println(i);
            }
        }
    }
}
