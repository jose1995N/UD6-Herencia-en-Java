package ejercicio3;
    public class TestYogures {
        public static void main(String[] args) {
            
            Yogur yogur = new Yogur();  
            YogurDesnatado yogurDesnatado = new YogurDesnatado();  
    
            
            System.out.println("Calorías de un Yogur: " + yogur.consultarCalorias() + " kcal");
            System.out.println("Calorías de un Yogur Desnatado: " + yogurDesnatado.consultarCalorias() + " kcal");
        }
    }

