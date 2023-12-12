/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carmonaruizudpcliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author Juanma
 */
public class CarmonaRuizUDPCliente {

    public static void main(String[] args) {

        DatagramSocket socketUDP;

        try {
            socketUDP = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);
            System.out.print("(Cliente): Ingrese 3 o menos letras para ver las palabras del servidor que tienen rima consonante con esas letras: ");
            String strMensaje = scanner.nextLine();

            InetAddress hostServidor = InetAddress.getByName("localhost");
            int puertoServidor = 12355;

            byte[] mensaje = strMensaje.getBytes();
            DatagramPacket peticion = new DatagramPacket(mensaje, mensaje.length,
                    hostServidor, puertoServidor);
            socketUDP.send(peticion);

            byte[] buffer = new byte[4096]; 
            DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length,
                    hostServidor, puertoServidor);
            socketUDP.receive(respuesta);
            System.out.println("(Cliente): Palabras recibidas:\n" + new String(buffer, 0, respuesta.getLength()));

            socketUDP.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
}
