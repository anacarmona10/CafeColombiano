package cafe;

public class Cafe {
    String nombre;
    String region;
    double precioPorKilo;
    double cantidadEnKilos;

    public Cafe(String nombre, String region, double precioPorKilo, double cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: " + precioPorKilo + " COP");
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
    }

    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    public void actualizarCantidad(double nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("Cantidad de kilos disponible cambiada a " + nuevaCantidad);
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = precioPorKilo * (porcentaje / 100);
        precioPorKilo = precioPorKilo - descuento;
        System.out.println("El porcentaje de descuento es " + porcentaje + ", entonces al precio se le restan " + descuento + ". Por lo que el precio final es " + precioPorKilo);
    }

}
