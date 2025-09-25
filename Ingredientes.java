
public abstract class Ingredientes {

    protected String nombre;
    protected String aporteNutricional;
    protected double calorias;
    protected double cantidad;

    public Ingredientes(String nombre, String aporteNutricional, double calorias, double cantidad) {
        this.nombre = nombre;
        this.aporteNutricional = aporteNutricional;
        this.calorias = calorias;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAporteNutricional() {
        return aporteNutricional;
    }

    public void setAporteNutricional(String aporteNutricional) {
        this.aporteNutricional = aporteNutricional;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }





  public void mostrarInfo() {
        System.out.println(nombre + " | " + aporteNutricional + " | " + calorias + " kcal | Cantidad: " + cantidad);
}

public abstract void preparar();



}

