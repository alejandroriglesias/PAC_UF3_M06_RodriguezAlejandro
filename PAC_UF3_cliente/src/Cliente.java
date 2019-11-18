import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

//CREACIÓN DE LA CLASE CLIENTE/////

public class Cliente {
    private final String HOST = "localhost";
    private final int PUERTO = 1234;
    private Socket socket;

//CONSTRUCTOR DEL SOCKET CLIENTE/////

    public Cliente() throws IOException {
        socket = new Socket(HOST, PUERTO);
    }

////FUNCIÓN PARA INICIAR EL CLIENTE/////

    public void iniciarCliente() throws IOException {

        ////BLOQUE TRY-CATCH////
        try {
                ////salidaServidor almacenará el nombre de la tortuga///
                DataOutputStream salidaServidor = new DataOutputStream(socket.getOutputStream());

                ///salidaServidor2 almacenará el dorsal de la tortuga///
                DataOutputStream salidaServidor2 = new DataOutputStream(socket.getOutputStream());

                System.out.println("Pulsa una tecla para elegir opción");

                ////LEEMOS POR TECLADO LA OPCIÓN QUE EL USUARIO ELIGE////
                Scanner scanner = new Scanner(System.in);
                int select = Integer.parseInt(scanner.nextLine());
                DataInputStream entradaServidor = new DataInputStream(socket.getInputStream());

                //RECIBIMOS E IMPRIMIMOS EL MENSAJE DE CONFIRMACIÓN DEL SERVIDOR//
                System.out.println(entradaServidor.readUTF());
                System.out.println("Has elegido:");

                ////MEDIANTE EL SWITCH, EL CÓDIGO EJECUTA LA OPCIÓN ELEGIDA ANTERIORMENTE////
                switch (select) {
                    case 1:
                        System.out.println("1. INTRODUCIR UNA NUEVA TORTUGA");
                            ///ALMACENA EL NOMBRE////
                            System.out.println("INTRODUCE EL NOMBRE");
                            String nombreTortuga = scanner.nextLine();
                            salidaServidor.writeUTF(nombreTortuga);

                            ///ALMACENA EL DORSAL////
                            System.out.println("INTRODUCE EL DORSAL");
                            int dorsalTortuga = Integer.parseInt(scanner.nextLine());
                            salidaServidor2.writeInt(dorsalTortuga);

                            ////IMPRIME EN CONSOLA CLIENTE LA TORTUGA CREADA////
                            System.out.println("Has creado a " + nombreTortuga + " con dorsal " + dorsalTortuga);
                            break;
                    case 2:
                        System.out.println("2. ELIMINAR UNA TORTUGA");
                        break;
                    case 3:
                        System.out.println("3. MOSTRAR TORTUGAS DISPONIBLES");
                        break;
                    case 4:
                        System.out.println("4. INICIAR CARRERA!");
                        break;
                    case 5:
                        System.out.println("5. SALIR");

                        //CERRAMOS LA CONEXIÓN
                        socket.close();
                        System.out.println("FIN DE LA CONEXION. GRACIAS!");
                        break;
                    default:
                        System.out.println("Ups! No reconozco ese número");
                        break;
                }


        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}

