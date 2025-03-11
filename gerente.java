package ejercicio3.ejercicio4;
public class gerente extends Empleado {
    
    // Constructor con parámetros
    public gerente(String nombre) {
        super(nombre);  // Llamada al constructor de la clase base
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Gerente " + getNombre();
    }
}
