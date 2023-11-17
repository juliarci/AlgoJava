import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args) {
        System.out.println("Saisissez un nombre entre 1 et 3");
        saisirNbr();
    }

    private static void saisirNbr() {
        Scanner sc = new Scanner(System.in);
        int nbr = Integer.parseInt(sc.next());
        while(nbr<1 || nbr>3){
            System.out.println("Choisissez un autre nombre");
            Scanner sc1 = new Scanner(System.in);
            nbr = Integer.parseInt(sc1.next());
        }
        System.out.println("Le nombre est valide");
    }
}
