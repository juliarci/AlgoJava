import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        System.out.println("Saisissez votre age");
        saisirAge();
    }

    private static void saisirAge() {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.next());
        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
    }
}
