package ejercicio3;

public class YogurDesnatado extends Yogur {
    
    public YogurDesnatado() {
        super(); // Llamamos al constructor de la clase base (Yogur) para inicializar las calorías
        this.calorias = this.calorias / 2;  // Reducimos las calorías a la mitad
    }

    // Método para obtener las calorías del YogurDesnatado (heredado de Yogur, pero ya con calorías reducidas)
    @Override
    public double consultarCalorias() {
        return calorias;  // Retorna las calorías ajustadas del YogurDesnatado
}
}