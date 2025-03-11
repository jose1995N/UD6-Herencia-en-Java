package ejercicio6;
public abstract class personas {
    private String nombre;

    // Constructor
    public personas(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void mostrar();
}

