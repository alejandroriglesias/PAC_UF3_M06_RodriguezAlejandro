
////DECLARACIÓN DE LA CLASE/////
public class Tortuga {
    public static String nombre;
    public static int dorsal;

    /////CONSTRUCTORES////
    public Tortuga(String nombre, int dorsal){
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public Tortuga() {

    }

    ////GETTERS Y SETTERS/////
    public String getNombre() {
        return nombre;
    }
    public int getDorsal() {

        return dorsal;
    }

    public static void setNombre(String nombre) {
        Tortuga.nombre = nombre;
    }

    public static void setDorsal(int dorsal) { Tortuga.dorsal = dorsal; }

    ////MÉTODO TO STRING////
    @Override
    public String toString() {
        return "Tortuga -->" + " NOMBRE= " + nombre + ", DORSAL= " + dorsal;
    };

}
