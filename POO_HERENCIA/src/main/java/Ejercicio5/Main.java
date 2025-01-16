package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Secretario juan = new Secretario("j","j","j","213123a","1231231241",1231.9,"12312541251","asda");
        System.out.println(juan);
        JefeDeZona rajoy = new JefeDeZona("rajoy", "Gomez", "Lopez", "12345678A", "60456", 500000000, "Despacho 1000");
        JefeDeZona jefe = new JefeDeZona("Carlos", "Gomez", "Lopez", "12345678A", "600123456", 50000, "Despacho 1");
        Vendedor vendedor = new Vendedor("Ana", "Martinez", "Perez", "87654321B", "600654321", 25000, null, null, 0.10);

// Set the supervisor
        vendedor.setSupervisor(jefe);
        jefe.setSupervisor(rajoy);
// Get the supervisor
        Empleado supervisor = vendedor.getSupervisor();

        System.out.println(jefe);
        System.out.println(vendedor);

    }
}
