package Ejercicio1Abstracto;

public enum Grado {
    PRIMERO_SMR(1,"SMR"),
    PRIMERO_DAM(1,"DAM"),
    PRIMERO_DAW(1,"DAW"),
    PRIMERO_ASIR(1,"ASIR"),
    SEGUNDO_SMR(2,"SMR"),
    SEGUNDO_DAM(2,"DAM"),
    SEGUNDO_ASIR(2,"DAM"),
    SEGUNDO_DAW(2,"DAW");

    private final int year;
    private final String curso;
    Grado(int year, String curso) {
        this.year = year;
        this.curso = curso;
    }
    public int getYear() {
        return year;
    }
    public String getCurso() {
        return curso;
    }
    @Override
    public String toString() {
        return "Año: "+year+" Curso: "+curso;
    }


}
