package Ejercicio4;

public abstract class Vehiculo {
    protected int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public abstract boolean incrementarVelocidad();
    public abstract boolean decrementarVelocidad();
@Override
    public String toString() {
        return "Velocidad: " + velocidad;
    }
}
