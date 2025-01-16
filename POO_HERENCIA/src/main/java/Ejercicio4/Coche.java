package Ejercicio4;

public class Coche extends VehiculoMotor {
    private String matricula;

    public Coche(int velocidad, String tipoMotor, int numMarchas, String matricula) {
        super(velocidad, tipoMotor, numMarchas);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void arrancarVehiculo() {
        setVelocidad(0);
        setMarchaActual(0);
    }

    public void acelerar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            incrementarVelocidad();
        }
    }

    public void frenar(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            decrementarVelocidad();
        }
    }

    @Override
    public boolean incrementarVelocidad() {
        setVelocidad(getVelocidad() + 1);
        return true;
    }

    @Override
    public boolean decrementarVelocidad() {
        if (getVelocidad() > 0) {
            setVelocidad(getVelocidad() - 1);
        } else {
            System.out.println("No puedes bajar más la velocidad");
        }
        return true;
    }

    @Override
    public int subirMarcha() {
        int cantidadMarchas = getNumMarchas();
        int marchaActual = getMarchaActual();
        if (marchaActual < cantidadMarchas - 1) {
            setMarchaActual(marchaActual + 1);
        } else {
            System.out.println("No puedes subir de marcha, ya no hay más marchas");
        }
        return getMarchaActual();
    }

    @Override
    public int bajarMarcha() {
        int marchaActual = getMarchaActual();
        if (marchaActual > 0) {
            setMarchaActual(marchaActual - 1);
        } else {
            System.out.println("No puedes bajar de marcha, ya estás en la marcha 0");
        }
        return getMarchaActual();
    }

    @Override
    public String toString() {
        return String.format("Coche{ Matricula: %s, Velocidad Actual: %d, Marcha Actual: %d }",
                matricula, getVelocidad(), getMarchaActual());
    }
}
