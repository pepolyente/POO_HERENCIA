package Ejercicio3;
import java.math.BigDecimal;
import java.time.LocalDate;


public abstract class Producto {
    private LocalDate fechaCaducidad;
    private int numeroLote;
    protected BigDecimal precio;

    public Producto(LocalDate fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    public LocalDate getFechaCaducidad() { return fechaCaducidad; }
    public int getNumeroLote() { return numeroLote; }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public void setNumeroLote(int numeroLote) { this.numeroLote = numeroLote; }
    public abstract void ponerPrecio(BigDecimal precioinicial);
    @Override
    public String toString() {
        return "El producto con la fecha: "+fechaCaducidad+" y el numero de lote: "+numeroLote;
    }
}
