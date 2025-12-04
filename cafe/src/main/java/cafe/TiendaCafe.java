package cafe;

public class TiendaCafe {
    public static void main(String[] args) {
        
        Cafe cafeNariño = new Cafe("Café de Nariño", "Nariño", 38000, 12.5);

        cafeNariño.mostrarInfo();
        cafeNariño.calcularPrecioTotal();
        cafeNariño.actualizarCantidad(50);
        cafeNariño.mostrarInfo();

        Cafe cafeAntioquia = new Cafe("Café de Antioquia", "Antioquia", 40000, 20);

        cafeAntioquia.mostrarInfo();
        cafeAntioquia.calcularPrecioTotal();
        cafeAntioquia.actualizarCantidad(15);
        cafeAntioquia.mostrarInfo();

        Cafe cafeHuila = new Cafe("Café del Huila", "Huila", 45000, 15);

        cafeHuila.mostrarInfo();
        cafeHuila.calcularPrecioTotal();
        cafeHuila.actualizarCantidad(68.5);
        cafeHuila.mostrarInfo();
    }
}
