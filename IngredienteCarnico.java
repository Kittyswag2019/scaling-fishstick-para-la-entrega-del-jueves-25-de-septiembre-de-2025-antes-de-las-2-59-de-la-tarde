
public class IngredienteCarnico extends Ingredientes {

    private String tipoAnimal;
    private String corte;

    public IngredienteCarnico(String nombre, String aporteNutricional, double calorias, double cantidad, String tipoAnimal, String corte) {
        super(nombre, aporteNutricional, calorias, cantidad);
        this.tipoAnimal = tipoAnimal;
        this.corte = corte;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    @Override
    public void preparar() {
     System.out.println("Marinando  " + nombre + " del animal " + tipoAnimal + " con corte: " + corte);
    }

}
