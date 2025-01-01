package excercice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        // Ajouter des comptes
        CompteCourant compte1 = new CompteCourant(111, 1000, "Ahmed", 500);
        CompteEpargne compte2 = new CompteEpargne(222, 2000, "Ali", 0.75);

        comptes.add(compte1);
        comptes.add(compte2);

        // Dépôt d'argent
        try {
            compte1.depot(500);
            System.out.println("Dépôt réussi. Nouveau solde : " + 500);
            compte1.afficherSolde(); // Votre solde est : 1500
            System.out.println("------------------------------");
        } catch (MontantInvalidException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("------------------------------");
        }

        // Retrait d'argent avec découvert
        try {
            compte1.retrait(200);
            System.out.println("Retrait effectué. : " + -200);
            compte1.afficherSolde(); // Votre solde est : 1300
            System.out.println("------------------------------");
        } catch (MontantInvalidException | FondsInsuffisantsException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("------------------------------");
        }

        // Ajouter des intérêts, compte épargne
        try {
            compte2.ajouterInterets(); // Intérêts ajoutés : 1500.0
            compte2.afficherSolde(); // Votre solde est : 3500
            System.out.println("------------------------------");
        } catch (MontantInvalidException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("------------------------------");
        }

        // transfert d'argent
        try {
            // Virement en faveur d'Ali par Ahmed, montant : 300
            compte1.transfert(compte2, 300);
            System.out.println("------------------------------");
        } catch (CompteInexistantException | MontantInvalidException | FondsInsuffisantsException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("------------------------------");
        }

        // Supprimer le compte avec le numéro du compte : 111
        long numCompte = 111;
        boolean success = comptes.removeIf(compte -> compte.num == numCompte);
        if (success) System.out.println("Le compte avec le numéro " + numCompte + " a été supprimé avec succès");
        else System.out.println("Le code " + numCompte + "que vous avez saisi n'est pas correct");
    }
}
