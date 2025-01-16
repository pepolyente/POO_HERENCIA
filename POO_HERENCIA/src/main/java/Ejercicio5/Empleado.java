package Ejercicio5;

import java.time.LocalDate;

public abstract class Empleado implements CotizacionSegSocial{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String direccion;
    private LocalDate fechaAntiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre,String apellido1,String apellido2,
                    String dni, String telefono,double salario ) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
        this.salario = salario;
        supervisor = null;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public String getDni() {
        return dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public LocalDate getFechaAntiguedad() {
        return fechaAntiguedad;
    }
    public String getTelefono() {
        return telefono;
    }
    public double getSalario() {
        return salario;
    }
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    public Empleado getSupervisor(){
        return supervisor;
    }
    public abstract void cambiarSupervisor(Empleado supervisor);
    public abstract void incrementarSalario();
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return ("El empleado " + nombre + ", "+ apellido1 + ", " + apellido2 + ", con DNI " +
                dni + ", teléfono " + telefono + " y salario de " + salario);
    }
}
