package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Persona rajoy = new Persona("Rajoy","Presidente","10101010101A",2025);
        System.out.println(rajoy);
        rajoy = new Alumno("Rajoy","Presidente","10101010A",2025,Grado.PRIMERO_ASIR);
        rajoy = new Profesor("Rajoy","Presidente","10101010A",2025,new Grado[]{Grado.PRIMERO_ASIR});
        rajoy = new Directivo("Rajoy","Presidente","10101010A",2025,new Grado[]{Grado.PRIMERO_ASIR},"Rey de España, emperador del cielo");
        System.out.println(rajoy);

    }

}
