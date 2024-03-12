/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carmonajuanmanuel53;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class CarmonaJuanManuel53 {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del archivo de entrada:");
        String archivoEntrada = scn.nextLine();
        
        File nuevoFichero = new File(archivoEntrada);
        if(!nuevoFichero.exists()){
            nuevoFichero.createNewFile();
        }
        System.out.println("Ingrese la contrasena:");
        String pass = scn.nextLine();

        try {
            String archivoEncriptado = "encriptado_" + archivoEntrada;
            Encriptar.encriptarArchivo(archivoEntrada, archivoEncriptado, pass);
            System.out.println("Archivo encriptado correctamente.");

            String archivoDesencriptado = "desencriptado_" + archivoEntrada;
            Desencriptar.desencriptarArchivo(archivoEncriptado, archivoDesencriptado, pass);
            System.out.println("Archivo desencriptado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
