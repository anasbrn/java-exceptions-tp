package tp1;

public class NombreNegatifException extends Exception {
    private int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        super("La valeur " + valeurErronee + " est un nombre négatif !");
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}
