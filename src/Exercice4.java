import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        System.out.println("Saisissez votre age");
        saisirAge();
    }

    private static void saisirAge() {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.next());
        if (age < 6) System.out.println("L'enfant ne fait partie d'aucune catégorie");
        else {
            if (age <= 7) System.out.println("L'enfant est dans la catégorie Poussin");
            else {
                if (age <= 9) System.out.println("L'enfant est dans la catégorie Pupille");
                else {
                    if (age <= 11) System.out.println("L'enfant est dans la catégorie Minime");
                    else {
                        System.out.println("L'enfant est dans la catégorie Cadet");
                    }
                }
            }
        }
    }
}
