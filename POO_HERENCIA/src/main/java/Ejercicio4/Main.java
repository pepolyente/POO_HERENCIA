package Ejercicio4;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bicicleta mia = new Bicicleta(0,"bicimia");
        mia.acelerar(10);
        System.out.println(mia);
        Coche mio = new Coche(0,"v8",6,"01");
        mio.arrancarVehiculo();
        mio.subirMarcha();
        mio.acelerar(10);
        System.out.println(mio);
        mio.acelerar(30);
        mio.subirMarcha();
        System.out.println(mio);
        mio.acelerar(40);
        mio.subirMarcha();
        System.out.println(mio);
        mio.acelerar(50);
        mio.subirMarcha();
        System.out.println(mio);
        mio.acelerar(100);
        mio.subirMarcha();
        System.out.println(mio);
        System.out.println(mio);
        mio.bajarMarcha();
        mio.bajarMarcha();
        mio.bajarMarcha();
        mio.bajarMarcha();
        mio.bajarMarcha();
        System.out.println(mio);
        Vehiculo[] concesionario = {mio,mia};
        System.out.println(Arrays.toString(concesionario));

        int suma= 0;
        for(Vehiculo v: concesionario){
            suma+= v.getVelocidad();

        }            System.out.println("Media: " + ((double)suma/concesionario.length));

    }
}
