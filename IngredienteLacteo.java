
public class IngredienteLacteo extends Ingredientes {

    private String proveniente;
    private double porcentajeGrasa;

    public IngredienteLacteo(String nombre, String aporteNutricional, double calorias, double cantidad, String proveniente, double porcentajeGrasa) {
        super(nombre, aporteNutricional, calorias, cantidad);
        this.proveniente = proveniente;
        this.porcentajeGrasa = porcentajeGrasa;
    }

    public String getTipoLeche() {
        return proveniente;
    }

    public void setTipoLeche(String tipoLeche) {
        this.proveniente = tipoLeche;
    }

    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public void setPorcentajeGrasa(double porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }

    @Override
    public void preparar() {
        if (nombre.equalsIgnoreCase("queso || quesito || cuajada")) {
            System.out.println("Rallando y derritiendo " + nombre + " proveniente de la " + proveniente + " con " + porcentajeGrasa + "% de grasa.");

        } else {
            System.out.println(" Batiendo " + nombre + " proveniente de la " + proveniente + " con " + porcentajeGrasa + "% de grasa.");
        }

    }

}
