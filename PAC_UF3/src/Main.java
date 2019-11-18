import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ////CREACIÓN DE OBJETO SERVIDOR E INICIALIZACIÓN DEL MISMO////
        Servidor serv = new Servidor();
        System.out.println("Iniciando el servidor. Espere por favor...");
        serv.iniciarServer();

    }
}
