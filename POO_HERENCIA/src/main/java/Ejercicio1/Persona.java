package Ejercicio1;

public class Persona {
    protected int edad;
    protected String nombre;
    protected String apellido;
    protected String DNI;

    public Persona (String nombre, String apellido, String DNI,int edad) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDNI() {
        return DNI;
    }
    public void cumpliAnyos (){
        edad++;
    }
    public void imprimirDNI(){
        System.out.println(DNI);
    }

    @Override
    public String toString() {
        return "Ejercicio1.Persona{" + "DNI" + DNI + ",nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    public boolean equals(Object object){
        if(object == null|| !(object instanceof Persona)){
            return false;
        }
        Persona persona = (Persona) object;
        return this.nombre.equals(persona.getNombre())&& this.DNI.equals(persona.getDNI()) && this.apellido.equals(persona.getApellido());
    }

}
