import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

    ////DECLARACIÓN DE LA CLASE SERVIDOR////

    public class Servidor{

        ///DECLARACIÓN DE VARIABLES////
        private final int PUERTO = 1234;
        private ServerSocket serverSocket;
        private Socket socket;
        private String mensajeDeCliente;
        private int mensajeDeCliente2;
        private String nombre;
        private int dorsal;

        ////INSTANCIAMOS UN OBJETO DE LA CLASE CARRERA, PARA PODER LLAMAR A LOS OBJETOS TORTUGA DESDE AHÍ////

        public Carrera carrera = new Carrera();

    ////CONSTRUCTOR PARA INICIALIZAR EL SOCKET DEL SERVIDOR////

        public Servidor() throws IOException {
            serverSocket = new ServerSocket(PUERTO);
            socket = new Socket();
        }

    /////MÉTODO PARA INICIAR EL SERVIDOR//////

        public void iniciarServer() throws IOException {
            ///BLOQUE TRY-CATCH////

            try {
                while(true) {
                    System.out.println("Estoy esperando que el cliente se conecte...");
                    ///RECIBIMOS LA PETICIÓN///
                    socket = serverSocket.accept();
                    DataInputStream mensajeAlServidor = new DataInputStream( socket.getInputStream() );

                    ////OBTENEMOS LA ENTRADA DEL CLIENTE////
                    DataOutputStream mensajeAlCliente = new DataOutputStream(socket.getOutputStream());

                    ////ENVIAMOS EL MENSAJE DE CONIFRMACIÓN AL CLIENTE////
                    mensajeAlCliente.writeUTF("Petición recibida. Un momento, por favor");

                    ////ESPERAMOS MENSAJE CLIENTE///
                    DataInputStream entrada = new DataInputStream(socket.getInputStream());

                        while (true) {
                                ///LA PRIMERA VARIABLE RECOGERÁ EL NOMBRE Y LA SEGUNDA, EL DORSAL////
                                mensajeDeCliente = entrada.readUTF();
                                mensajeDeCliente2 = entrada.readInt();

                                ////ALMACENAMOS LO RECBIBIDO POR EL CLIENTE EN NUEVAS VARIABLES////
                                nombre = mensajeDeCliente;
                                dorsal = mensajeDeCliente2;

                                //ESTABLECEMOS EL NOMBRE Y EL DORSAL DE LA TORTUGA A TRAVÉS DEL SETTER Y LA IMPRIMIMOS
                                Tortuga tortuga = carrera.setTortuga(mensajeDeCliente, mensajeDeCliente2);
                                System.out.println(tortuga);

                        }
                }
            }catch (IOException e) {
                System.out.println(e.getMessage());

            }finally{
                serverSocket.close();
                System.out.println("FIN DE LA CONEXION. GRACIAS!");
            }
    }
}