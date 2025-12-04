package cafe;

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 35000, 12.5);

        cafe1.mostrarInfo();

        System.out.println("Total: " + cafe1.calcularPrecioTotal() + " COP");

        cafe1.actualizarCantidad(20);

        cafe1.mostrarInfo();
    }
}