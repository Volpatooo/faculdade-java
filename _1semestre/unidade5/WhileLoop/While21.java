package unidade5.WhileLoop;

public class While21 {
    public static void main(String[] args) {
        float alturaChico = 1.5f;
        float alturaZe = 1.1f;
        int contAnos = 0;

        while (alturaZe < alturaChico) { // sempre uniformizar a unidade de medida
            alturaChico += 0.02f;
            alturaZe += 0.03f;
            contAnos++ ;
        }

        System.out.println("Serão necessários: " + contAnos + " anos.");
    } 
}
