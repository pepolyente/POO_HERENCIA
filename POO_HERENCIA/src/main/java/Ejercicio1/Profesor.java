package Ejercicio1;

public class Profesor extends Persona{
    protected Grado[] grados;

    public Profesor(String nombre, String apellido,String DNI, int edad,Grado[] grados) {
        super(nombre,apellido,DNI,edad);
        this.grados = grados;
    }
    public Grado[] getGrados() {
        return grados;
    }

    @Override
    public String toString() {
        return "El profesor"+getNombre()+getApellido()+ "imparte los grados: ("+getGrados()+")";
    }

    @Override
    public void imprimirDNI() {
        super.imprimirDNI();
    }
}
