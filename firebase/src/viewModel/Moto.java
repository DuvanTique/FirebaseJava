package viewModel;

public class Moto {
    private String nombre;
    private double precio;

    public Moto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Moto() {
    }
      
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Moto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
      
}