/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carmonajuanmanuelservidorftp;

import java.io.IOException;

/**
 *
 * @author juanm
 */
public class CarmonaJuanManuelServidorFTP {

    public static void main(String[] args) throws IOException {
        GestorFTPCarmona gestorFTP = new GestorFTPCarmona("127.0.0.1", 21, "Usuario", "123");
        try {
            if (gestorFTP.conectar()) {
                System.out.println("Conexion establecida");
            } else {
                System.out.println("No se ha podido establecer la conexion");
            }
            gestorFTP.descargarFicheros();
            gestorFTP.getClienteFTP().disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
