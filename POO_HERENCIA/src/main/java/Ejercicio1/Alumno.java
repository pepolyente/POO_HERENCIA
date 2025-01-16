package Ejercicio1;

public class Alumno extends Persona {
    protected int NIA;
    protected Grado grado;
    public Alumno(String nombre, String apellido,String DNI, int edad, Grado grado) {
        super(DNI,nombre, apellido,edad);
        this.grado = grado;
        this.NIA = generarNIA();
    }
    public Alumno(String nombre, String apellido,String DNI, int edad, Grado grado, int NIA) {
        super(DNI,nombre, apellido,edad);
        this.grado = grado;
        this.NIA = NIA;
    }
    public int getNIA() {return NIA;}
    public Grado getGrado() {return grado;}

    private int generarNIA() {
        return (int)(Math.random()*10000000)+1;
    }
    @Override
    public void imprimirDNI(){
        System.out.println("Desde la clase Ejercicio1.Alumno imprimo DNI "+ this.getDNI());
    }
    @Override
    public String toString() {
        return "Ejercicio1.Alumno de " + grado + "con NIA: " + NIA + super.toString();
    }

}
