package cocina.recetas;


public abstract class Receta {
    protected String nombre;
    protected int calorias;
    protected int tiempo_preparacion;

    public Receta (String nombre, int calorias, int tiempo_preparacion){
this.nombre = nombre;
this.calorias = calorias;
this.tiempo_preparacion = tiempo_preparacion;

    }

    public abstract void mostrarIngredientes();
    public abstract void cocinar();

    public void infoReceta(){
        System.out.println("la receta se demora:" + tiempo_preparacion);
    }
}
