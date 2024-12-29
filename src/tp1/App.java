package tp1;

public class App {
    public static void main(String[] args) {
        try {
            // Test Case 1: Création d'un tp1.EntierNaturel avec une valeur valide
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Case 1 - Valeur initiale : " + entier.getVal());
            System.out.println("-----");

            // Test Case 2: Modification de la valeur
            entier.setVal(10);
            System.out.println("Case 2 - Valeur après modification : " + entier.getVal());
            System.out.println("-----");

            // Test Case 3: Décrémentation de la valeur
            entier.decrementer();
            System.out.println("Case 3 - valeur après décrémentation : " + entier.getVal());
            System.out.println("-----");

            // Test Case 4: Tester l'exception pour une valeur négative dans setVal()
            try {
                entier.setVal(-5); // Cela devrait lever l'exception tp1.NombreNegatifException
            } catch (NombreNegatifException e) {
                System.out.println("Case 4 - Erreur de changer la valeur : " + e.getMessage());
                System.out.println("Valeur erronée : " + e.getValeurErronee());
            }
            System.out.println("-----");

        } catch (NombreNegatifException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            // Test Case 5: Tester la création d'un tp1.EntierNaturel avec une valeur négative
            EntierNaturel entier = new EntierNaturel(-1); // Cela devrait lever l'exception tp1.NombreNegatifException
        } catch (NombreNegatifException e) {
            System.out.println("Case 5 - Erreur de création d'un tp1.EntierNaturel : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
        System.out.println("-----");

        try {
            // Test Case 6: Tester la décrémentation d'un entier naturel avec valeur 0
            EntierNaturel entier = new EntierNaturel(0);
            entier.decrementer(); // Cela devrait lever l'exception tp1.NombreNegatifException
        } catch (NombreNegatifException e) {
            System.out.println("Case 6 - Erreur de décrementer : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
    }
}
