import java.io.IOException;

public class MainCliente {

    public static void main(String[] args) throws IOException {

        //CREACIÓN DE UN NUEVO OBJETO CLIENTE E IMPRESIÓN POR PANTALLA DEL MENÚ DE OPCIONES

        Cliente cli = new Cliente();
        System.out.println("Iniciando cliente");
        System.out.println("BIENVENIDO AL UNIVERSO TORTUGA. ¿Qué quiere hacer? \n");
        System.out.println("1. INTRODUCIR UNA NUEVA TORTUGA");
        System.out.println("2. ELIMINAR UNA NUEVA TORTUGA");
        System.out.println("3. MOSTRAR TORTUGAS DISPONIBLES");
        System.out.println("4. INICIAR CARRERA!");
        System.out.println("5. SALIR");

        //LLAMADA PARA INICIAR EL CLIENTE
        cli.iniciarCliente();


        }

    }