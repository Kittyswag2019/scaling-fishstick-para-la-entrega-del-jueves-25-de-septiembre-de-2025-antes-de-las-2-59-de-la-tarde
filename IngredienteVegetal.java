public class IngredienteVegetal extends Ingredientes {  
    private String color;

    public IngredienteVegetal(String nombre, String aporteNutricional, double calorias, double cantidad, String color) {
        super(nombre, aporteNutricional, calorias, cantidad);
      
        this.color = color;
    }



    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


@Override
    public void preparar() {
        System.out.println("Lavando y cortando  " + nombre  + " de color: " + color);
    }

}