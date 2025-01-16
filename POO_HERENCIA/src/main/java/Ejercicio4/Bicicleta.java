package Ejercicio4;

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(int velocidad, String tipo) {
        super(velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }

    // Acelera la bicicleta aumentando la velocidad en bloques de 4.
    public void acelerar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            incrementarVelocidad();
        }
    }

    // Incrementa la velocidad en 4 unidades
    @Override
    public boolean incrementarVelocidad() {
        setVelocidad(getVelocidad() + 4);
        return true;
    }

    // Decrementa la velocidad en 4 unidades si es posible
    @Override
    public boolean decrementarVelocidad() {
        if (getVelocidad() >= 4) {
            setVelocidad(getVelocidad() - 4);
        }
        return true;
    }

    // Representación en cadena
    @Override
    public String toString() {
        return "Bicicleta{" + "tipo='" + tipo + "', velocidad=" + getVelocidad() + '}';
    }
}
