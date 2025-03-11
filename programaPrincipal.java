package ejercicio3.ejercicio4;
public class programaPrincipal {
    public static void main(String[] args) {
        // Crear instancias de cada clase
        Empleado empleado = new Empleado("Carlos") {
            // Implementación anónima para crear una instancia de la clase abstracta Empleado
            @Override
            public String toString() {
                return "Empleado " + getNombre();
            }
        };
        
        gerente gerente = new gerente("Ana");
        Desarrollador desarrollador = new Desarrollador("Luis");
        Vendedor vendedor = new Vendedor("María");

        // Imprimir los resultados
        System.out.println(empleado.toString());
        System.out.println(gerente.toString());
        System.out.println(desarrollador.toString());
        System.out.println(vendedor.toString());
    }
}
