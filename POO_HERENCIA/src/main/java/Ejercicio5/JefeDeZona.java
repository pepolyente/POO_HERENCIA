package Ejercicio5;

public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private CocheEmpresa coche;

    public JefeDeZona(String nombre, String apellido1, String apellido2, String dni, String telefono, double salario, String despacho) {
        super(nombre, apellido1, apellido2, dni, telefono, salario);
        this.despacho = despacho;
        this.vendedores = new Vendedor[0]; // Inicializamos el array de vendedores vacío
    }

    public String getDespacho() {
        return despacho;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public CocheEmpresa getCoche() {
        return coche;
    }

    public void darAlta(Vendedor vendedor) {
        Vendedor[] nuevoArray = new Vendedor[vendedores.length + 1];
        System.arraycopy(vendedores, 0, nuevoArray, 0, vendedores.length);
        nuevoArray[vendedores.length] = vendedor;
        vendedores = nuevoArray;
    }
    public void darBaja(Vendedor vendedor) {
        int index = -1;

        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equals(vendedor)) {
                index = i;
            }
        }
        if (index != -1) {
            Vendedor[] nuevoArray = new Vendedor[vendedores.length - 1];
            int j = 0;

            for (int i = 0; i < vendedores.length; i++) {
                if (i != index) {
                    nuevoArray[j++] = vendedores[i];
                }
            }
            vendedores = nuevoArray;
        }
    }
    public void cambiarSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void cambiarCoche(CocheEmpresa coche) {
        this.coche = coche;
    }

    @Override
    public void cambiarSupervisor(Empleado supervisor) {
        if (supervisor instanceof Secretario || supervisor instanceof JefeDeZona) {
            setSupervisor(supervisor);
        } else {
            throw new IllegalArgumentException("El supervisor debe ser un Secretario o JefeDeZona.");
        }
    }


    @Override
    public void incrementarSalario() {
        setSalario(getSalario() );
    }

    @Override
    public Empleado getSupervisor(){
        return super.getSupervisor();
    }
    @Override
    public double calcularIRPF(){
        return 0;
    }
    @Override
    public double calcularContingenciasComunes(){
        return 0;
    }
    @Override
    public void imprimirEtiqueta(){

    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("(Jefe de Zona)\n ");
        str.append(super.toString())
                .append(" Coche de empresa: ").append(this.coche).append("\n")
                .append("Despacho: ").append(despacho).append("\n")
                .append("Secretario: ").append(secretario).append("\n")
                .append("Vendedores a su cargo: ");
        if (vendedores.length > 0) {
            for (Vendedor vendedor : vendedores) {
                str.append(vendedor.getNombre()).append(" ");
            }
        } else {
            str.append("No tiene vendedores asignados.");
        }
        str.append("\n").append("Coche: ").append(coche).append("\n");
        return str.toString();
    }
}
