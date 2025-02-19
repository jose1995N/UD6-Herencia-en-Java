/*1. Se desea almacenar cierta información sobre personas. En concreto, interesa saber:
a. NIF: Número de Identificación Fiscal
b. Altura: Expresada en centímetros
c. Edad: Expresada en años
d. Por defecto, una persona para la que se no especifique dicha información se asume que
tendrá 25 años, NIF: 11111111A y 175 cm de altura
Diseña la clase Persona con sus atributos, constructores, getters y setters. Diseña la clase TestPersona
que cree dos personas, una con la información por defecto y otra con la que tú mismo inventes, y
que muestre la información por pantalla.*/

public class testPersona {
    public static void main(String[] args) {
        Personas personas1 = new Personas();
        // parametros introducidos
        Personas personas2 = new Personas("201548S", 195,29);
   
   
        System.out.println("informacion sobre la persona 1 por defecto");
         personas1.mostrar();
        System.out.println("Informacion de persona 2 con los valores introducidos");
        personas2.mostrar();
}
}
