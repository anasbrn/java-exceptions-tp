package excercice2;

public class CompteCourant extends CompteBancaire {
    double decouvertAutorise;

    public CompteCourant(long num, double solde, String titulaire, double decouvertAutorise) {
        super(num, solde, titulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException, MontantInvalidException {
        if (montant <= 0) throw new MontantInvalidException("Montant Invalid");
        else if (getSolde() + decouvertAutorise >= montant) this.solde -= montant;
        else throw new FondsInsuffisantsException("Fonds insuffisants même avec le découvert autorisé.");
    }
}
