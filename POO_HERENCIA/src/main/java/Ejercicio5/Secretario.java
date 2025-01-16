package Ejercicio5;

public class Secretario extends Empleado {
    private String despacho;
    private String numFax;

    public Secretario(String nombre, String apellido1, String apellido2,String dni, String telefono,
                      double salario,String numFax, String despacho) {
        super(nombre,apellido1,apellido2,dni,telefono,salario);
        this.despacho = despacho;
        this.numFax = numFax;
    }
    @Override
    public String getNombre() {
        return super.getNombre();
    }
    @Override
    public String getApellido1() {
        return super.getApellido1();
    }
    @Override
    public String getApellido2() {
        return super.getApellido2();
    }
    @Override
    public String getDni() {
        return super.getDni();
    }
    @Override
    public String getTelefono() {
        return super.getTelefono();
    }
    @Override
    public double getSalario() {
        return super.getSalario();
    }
    @Override
    public  Empleado getSupervisor(Empleado supervisor){
       return supervisor;
    }
    public String getDescpacho() {
        return despacho;
    }
    public String getNumFax() {
        return numFax;
    }
    @Override
    public void cambiarSupervisor(){

    }
    @Override
    public void incrementarSalario(double salario){

    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("(Secretario\n) ");
        str.append(super.toString()).append(" Tiene el despacho: ").append(getDescpacho()).append(" y número de fax ").append(getNumFax());
        return str.toString();
    }
}
