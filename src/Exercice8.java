import java.util.Arrays;
import java.util.Scanner;

public class Exercice8 {

    public static void main(String[] args) {
        saisirNbr();
    }

    private static void saisirNbr() {
        int[] tab = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Saisissez votre nombre " + i + " :");
            Scanner sc2 = new Scanner(System.in);
            int nbr2 = Integer.parseInt(sc2.next());
            tab[i] = nbr2;
        }
        System.out.println(Arrays.toString(tab));
    }
}
