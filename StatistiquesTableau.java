
import java.util.Scanner;
import java.util.Locale;

public class StatistiquesTableau {

    // Méthode pour trouver le minimum
    public static int min(int[] tab) {
        int minimum = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < minimum) {
                minimum = tab[i];
            }
        }
        return minimum;
    }

    // Méthode pour trouver le maximum
    public static int max(int[] tab) {
        int maximum = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maximum) {
                maximum = tab[i];
            }
        }
        return maximum;
    }

    // Méthode pour calculer la moyenne
    public static double moyenne(int[] tab) {
        if (tab.length == 0) return 0.0;
        double somme = 0;
        for (int val : tab) {
            somme += val;
        }
        return somme / tab.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // 1. Saisie de la taille du tableau (n)
        System.out.print("Entrez le nombre d'éléments (n) : ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Le nombre d'éléments doit être supérieur à 0.");
            scanner.close();
            return;
        }

        // 2. Remplissage du tableau
        int[] tab = new int[n];
        System.out.println("Entrez les " + n + " entiers :");
        for (int i = 0; i < n; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        // 3. Appels des méthodes
        int minValue = min(tab);
        int maxValue = max(tab);
        double moyValue = moyenne(tab);

        // 4. Calcul du nombre de valeurs supérieures à la moyenne
        int compteurSuperieurs = 0;
        for (int val : tab) {
            if (val > moyValue) {
                compteurSuperieurs++;
            }
        }

        // 5. Affichage des résultats
        System.out.println("\n--- Résultats ---");
        System.out.println("Minimum : " + minValue);
        System.out.println("Maximum : " + maxValue);
        System.out.printf(Locale.US, "Moyenne : %.2f%n", moyValue);
        System.out.println("Nombre de valeurs supérieures à la moyenne : " + compteurSuperieurs);

        scanner.close();
    }
}
    

