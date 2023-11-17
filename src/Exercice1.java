import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        saisirNom();
    }

    public static void saisirNom() {
        Scanner sc = new Scanner(System.in);
        String nom = sc.next();
        System.out.println("Bonjour " + nom);
    }
}
