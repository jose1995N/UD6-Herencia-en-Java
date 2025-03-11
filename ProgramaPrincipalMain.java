package ejercicio6;

public class ProgramaPrincipalMain {
    public static void main(String[] args) {
   
        alumno alumno = new alumno("Carlos Pérez", "12345");

        profesor profesor = new profesor("Ana Gómez", "Matemáticas");

        System.out.println("Información del Alumno:");
        alumno.mostrar();
        System.out.println(); 

        System.out.println("Información del Profesor:");
        profesor.mostrar();
    }
}

