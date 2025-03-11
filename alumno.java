package ejercicio6;
public class alumno extends personas {
    private String matricula;

    // Constructor
    public alumno(String nombre, String matricula) {
        super(nombre);  // Llamada al constructor de la clase base
        this.matricula = matricula;
    }

    // Getter para la matrícula
    public String getMatricula() {
        return matricula;
    }

    // Implementación del método abstracto mostrar()
    @Override
    public void mostrar() {
        System.out.println("Nombre del alumno: " + getNombre());
        System.out.println("Matrícula: " + matricula);
    }
}
