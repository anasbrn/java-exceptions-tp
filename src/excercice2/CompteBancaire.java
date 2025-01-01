package excercice2;

public class CompteBancaire {
    protected long num;
    protected double solde;
    protected String titulaire;

    public CompteBancaire(long num, double solde, String titulaire) {
        this.num = num;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public void afficherSolde() {
        System.out.println("Votre solde est: " + solde);
    }

    public void depot(double montant) throws MontantInvalidException {
        if (montant > 0) this.solde += montant;
        else throw new MontantInvalidException("Montant Invalid");
    }

    public void virementRecu(double montant, String emetteurNom) {
        this.solde += montant;
        System.out.println("Virement recu de la part de " + emetteurNom + ", montant: " + montant);
        this.afficherSolde();
    }

    public void retrait(double montant) throws MontantInvalidException, FondsInsuffisantsException {
        if (montant <= 0) throw new MontantInvalidException("Montant Invalid");
        if (montant > solde) throw new FondsInsuffisantsException("Le solde de votre compte est insuffisant");
        this.solde -= montant;
        System.out.println("Le retrait de " + montant + " a été effectué avec succès");
    }

    public void transfert(CompteBancaire beneficiaire, double montant) throws CompteInexistantException, MontantInvalidException, FondsInsuffisantsException {
        if (beneficiaire == null) throw new CompteInexistantException("Le compte du bénéficiaire n'existe pas");
        this.retrait(montant);
        beneficiaire.virementRecu(montant, this.titulaire);
        System.out.println("Virement en faveur de " + beneficiaire.getTitulaire() + " a bien été traité, montant: " + montant);
        this.afficherSolde();
    }
}
