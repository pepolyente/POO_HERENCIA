package Ejercicio3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductoFresco extends Producto {
    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    @Override
    public void ponerPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return toString()+" y la fechaEnvasado: "+fechaEnvasado+" y el paisOrigen: "+paisOrigen+ "y el precio es "+precio;
    }
}
