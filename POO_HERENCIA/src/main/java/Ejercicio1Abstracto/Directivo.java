package Ejercicio1Abstracto;

public class Directivo extends Profesor {
    private String cargo;

    public Directivo(String nombre, String apellido, String DNI, int edad, Grado[] grados, String cargo) {
        super(nombre, apellido, DNI, edad, grados);
        this.cargo = cargo;
    }
    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimirDNI() {
        super.imprimirDNI();
    }

    @Override
    public String toString() {
        return "Prosfesor"+getNombre()+"es directivo de " + cargo + '}';
    }

}
