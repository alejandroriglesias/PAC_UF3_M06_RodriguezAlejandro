import java.util.ArrayList;

public class Carrera {

    ////CREAMOS UN ARRAYLIST DE TIPO "Tortuga", QUE SERÁ USADO EN DISTINTAS CLASES///
    ArrayList <Tortuga> listaTortuga = new ArrayList <Tortuga>();

    ////CONSTRUCTOR DE OBJETOS TORTUGA////
    public Tortuga setTortuga( String nombre, int dorsal){
        Tortuga tortuga = new Tortuga();
        tortuga.setNombre(nombre);
        tortuga.setDorsal(dorsal);
        listaTortuga.add(tortuga);
        return tortuga;
    }

    ////MÉTODO PARA OBTENER EL LISTADO DE TORTUGAS////
    public ArrayList<Tortuga> getTortugas() {
        return listaTortuga;
    }

    ////AUNQUE ESTÁ COMENTADO; ESTE SERÍA PARTE DE MI CÓDIGO PARA LA CARRERA////
  /*  @Override
    public void run() {
        try {
            Random random = new Random();
            for (int i = 0; i <= 500; i++) {
                System.out.println(random.nextInt(500));
                Thread.sleep(200);
            }
        }catch(InterruptedException e){
                e.printStackTrace();
        }
    }*/

}
/*  ArrayList<Tortuga> listaTortuga = new ArrayList<Tortuga>();

        Tortuga tortuga = new Tortuga(nombre, dorsal);
        listaTortuga.add(tortuga);

///VAMOS AÑADIENDO LOS OBJETOS TORTUGA CON LOS PARÁMETROS QUE NOS LLEGAN DESDE EL CLIENTE///
        for (Tortuga tortuga : listaTortuga) {
        System.out.println(tortuga);
                            }*/
//System.out.println(listaTortuga);

