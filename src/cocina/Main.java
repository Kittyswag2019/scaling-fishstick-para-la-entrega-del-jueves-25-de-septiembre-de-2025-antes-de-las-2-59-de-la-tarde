package cocina;

import cocina.recetas.Receta;
import cocina.recetas.RecetaAleatoria;

public class Main {
    public static void main(String[] args) {
        // Crear una receta aleatoria
        Receta receta = new RecetaAleatoria("Receta sorpresa", 350, 25);

        // Usar los métodos
        receta.infoReceta();           // muestra el tiempo de preparación
        receta.mostrarIngredientes();  // ingredientes aleatorios
        receta.cocinar();              // pasos de cocina
    
        
    }
}