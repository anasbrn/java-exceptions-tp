package excercice2;

public class CompteEpargne extends CompteBancaire {
    double tauxInteret;
    public CompteEpargne(long num, double solde, String titulaire, double tauxInteret) {
        super(num, solde, titulaire);
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInterets() throws MontantInvalidException {
        double interets = getSolde() * tauxInteret;
        depot(interets);
        System.out.println("Intérêts ajoutés: " + interets);
    }}
