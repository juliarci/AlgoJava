import java.util.*;

public class Exercice10 {
    public static void main(String[] args) {
        saisirNbr();
    }

    private static void saisirNbr() {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            System.out.println("Saisissez votre nombre " + i + " :");
            Scanner sc2 = new Scanner(System.in);
            int nbr2 = Integer.parseInt(sc2.next());
            arr.add(nbr2);
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
