package ejercicio3.ejercicio4;

public class Directivo extends Empleado{

    public Directivo(){
    }
    public Directivo(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}

