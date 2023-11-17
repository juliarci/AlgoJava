import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {
        System.out.println("Saisissez un nombre");
        saisirNbr();
    }

    private static void saisirNbr() {
        Scanner sc = new Scanner(System.in);
        int nbr = Integer.parseInt(sc.next());
        int fact = 1;
        for (int i=1; i<=nbr; i++){
            fact=fact*i;
        }
        System.out.println("Le factoriel de ce nombre est "+fact);
    }
}
