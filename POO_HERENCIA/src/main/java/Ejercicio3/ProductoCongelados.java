package Ejercicio3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductoCongelados extends Producto {
    private int temperaturaCongeladaRecom;

    public ProductoCongelados(LocalDate fechaCaducidad, int numeroLote, int temperaturaCongeladaRecom) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongeladaRecom = temperaturaCongeladaRecom;
    }
    public int getTemperaturaCongeladaRecom() {
        return temperaturaCongeladaRecom;
    }
    public void setTemperaturaCongeladaRecom(int temperaturaCongeladaRecom) {
        this.temperaturaCongeladaRecom = temperaturaCongeladaRecom;
    }
    @Override
    public void ponerPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return toString()+" y la temperatura congelada recomendada"+temperaturaCongeladaRecom + "y el precio es "+precio;
    }
}
