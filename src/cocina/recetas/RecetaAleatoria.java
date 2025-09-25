package cocina.recetas;
import java.util.Random;

public class RecetaAleatoria extends Receta {
    private String[] posiblesIngredientes = {
        "Arroz", "Pollo", "Chocolate", "Leche", "Tomate",
        "Queso", "Pan", "Carne", "Manzana", "Papa"
    };

    public RecetaAleatoria(String nombre, int calorias, int tiempoPreparacion) {
        super(nombre, calorias, tiempoPreparacion);
    }

    @Override
    public void mostrarIngredientes() {
        Random random = new Random();
        System.out.print("Ingredientes aleatorios para " + nombre + ": ");
        for (int i = 0; i < 3; i++) {
            int idx = random.nextInt(posiblesIngredientes.length);
            System.out.print(posiblesIngredientes[idx] + ", ");
        }
        System.out.println();
    }

    @Override
    public void cocinar() {
        System.out.println("Inventando cómo cocinar la receta" + nombre);
    }
}