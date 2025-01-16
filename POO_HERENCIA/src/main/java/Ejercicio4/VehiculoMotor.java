package Ejercicio4;

public abstract class VehiculoMotor extends Vehiculo {
    private String tipoMotor;
    private int numMarchas;
    private int marchaActual;

    public VehiculoMotor(int velocidad, String tipoMotor, int numMarchas) {
        super(velocidad);
        this.tipoMotor = tipoMotor;
        this.numMarchas = numMarchas;
    }
    public int getMarchaActual() {
        return marchaActual;
    }
    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }
    public abstract void arrancarVehiculo();

    public String getTipoMotor() {
        return tipoMotor;
    }
    public int getNumMarchas() {
        return numMarchas;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }
    public abstract int subirMarcha();
    public abstract int bajarMarcha();


    public abstract void acelerar(int acelerar);


    public abstract void frenar(int acelerar);

}
