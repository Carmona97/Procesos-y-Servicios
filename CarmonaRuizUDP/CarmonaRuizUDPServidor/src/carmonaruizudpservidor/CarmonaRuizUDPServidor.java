/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carmonaruizudpservidor;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author Juanma
 */
public class CarmonaRuizUDPServidor {

    public static void main(String[] args) {

        DatagramSocket socket;

        try {

            socket = new DatagramSocket(12355);

            System.out.println("Servidor iniciado, esperando una secuencia de letras...");
            byte[] bufferLectura = new byte[3];
            DatagramPacket datagramaEntrada = new DatagramPacket(bufferLectura, bufferLectura.length);
            socket.receive(datagramaEntrada);

            String letrasComienzo = new String(bufferLectura, 0, datagramaEntrada.getLength());

            System.out.println("(Servidor) Letras recibidas: " + letrasComienzo);
        
            String palabrasConLetra = obtenerPalabrasConLetra(letrasComienzo);
            byte[] mensajeEnviado = palabrasConLetra.getBytes();

            DatagramPacket datagramaSalida = new DatagramPacket(mensajeEnviado, mensajeEnviado.length,datagramaEntrada.getAddress(),datagramaEntrada.getPort());
            socket.send(datagramaSalida);

        
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String obtenerPalabrasConLetra(String letrasComienzo) throws IOException { 
    
        File diccionario = new File("src\\carmonaruizudpservidor\\diccionario.txt");
        Scanner lectorArchivo = new Scanner(diccionario);
        String mostrarPalabras = "";
        int contador = 0;

        do {
            String linea = lectorArchivo.nextLine();
            if (linea.endsWith(letrasComienzo)) {
                mostrarPalabras += linea + "\n";
                contador++;
            }
        } while (lectorArchivo.hasNext());
        lectorArchivo.close();
        mostrarPalabras += "Se han encontrado " + contador + " palabras con la terminación -"+letrasComienzo;
        return mostrarPalabras;
    }
    
}
