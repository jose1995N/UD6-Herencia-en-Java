package ejercicio3;

public class Yogur {
    protected double calorias;

    // Constructor que establece las calorías de un Yogur normal
    public Yogur() {
        this.calorias = 120.5; // Un yogur normal tiene 120.5 calorías
    }

    // Método para obtener las calorías del Yogur
    public double consultarCalorias() {
        return calorias;
    }
}
