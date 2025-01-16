package Ejercicio3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    private int codSupersivionAlimentaria;

    public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, int codSupersivionAlimentaria) {
        super(fechaCaducidad, numeroLote);
        this.codSupersivionAlimentaria = codSupersivionAlimentaria;
    }
    public int getCodSupersivionAlimentaria() {
        return codSupersivionAlimentaria;
    }
    public void setCodSupersivionAlimentaria(int codSupersivionAlimentaria) {
        this.codSupersivionAlimentaria = codSupersivionAlimentaria;
    }
    @Override
    public void ponerPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return toString()+" y el código del organismo de la supervisión alimentaria: "+codSupersivionAlimentaria+ "y el precio es "+precio;
    }
}
