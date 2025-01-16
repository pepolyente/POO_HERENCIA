package Ejercicio5;

public class Vendedor extends Empleado implements CotizacionSegSocial{
    private CocheEmpresa coche;
    private String telefonoMovil;
    private String areaVenta;
    private String[] clientes;
    private double porcComisiones;

    public Vendedor(String nombre, String apellido1, String apellido2, String dni, String telefono, double salario, CocheEmpresa coche, String cliente, double porcComisiones) {
        super(nombre, apellido1, apellido2, dni, telefono, salario);
        this.coche = coche;
        this.clientes = new String[0];
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
    public CocheEmpresa getCoche() {
        return coche;
    }
    public String getTelefonoMovil() {
        return telefonoMovil;
    }
    public String getAreaVenta() {
        return areaVenta;
    }
    public String[] getClientes() {
        return clientes;
    }
    public double getPorcComisiones() {
        return porcComisiones;
    }


    public void darAlta(String cliente) {
        String[] nuevoArray = new String[clientes.length + 1];
        System.arraycopy(clientes, 0, nuevoArray, 0, clientes.length);
        nuevoArray[clientes.length] = cliente;
        clientes = nuevoArray;
    }
    public void darBaja(String cliente) {
        int index = -1;

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(cliente)) {
                index = i;
            }
        }
        if (index != -1) {
            String[] nuevoArray = new String[clientes.length - 1];
            int j = 0;
            for (int i = 0; i < clientes.length; i++) {
                if (i != index) {
                    nuevoArray[j++] = clientes[i];
                }
            }
            clientes = nuevoArray;
        }
    }
    public void cambiarCoche(CocheEmpresa coche){
        this.coche = coche;
    }
    @Override
    public  void cambiarSupervisor(){

    }
    @Override
    public  void incrementarSalario(double salario){

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("(Vendedor\n) ");
        str.append(super.toString()).append(" Coche de empresa: ").append(this.coche).append("\n")
                .append("Teléfono de ventas: "+telefonoMovil+"\n")
                .append("Area Venta: "+areaVenta+"\n")
                .append("Clientes: "+clientes).append("\n")
                .append("Porcentaje comisiones: "+porcComisiones).append("\n");
        return str.toString();
    }
}
