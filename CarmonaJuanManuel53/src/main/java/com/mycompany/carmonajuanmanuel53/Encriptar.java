/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carmonajuanmanuel53;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author juanm
 */
public class Encriptar {
    private static final String ALGORITMO = "AES";
    private static final String TRANSFORMACION = "AES";

    public static void encriptarArchivo(String archivoEntrada, String archivoSalida, String contraseña) throws Exception {
        realizarCifrado(Cipher.ENCRYPT_MODE, archivoEntrada, archivoSalida, contraseña);
    }

    private static void realizarCifrado(int modoCifrado, String archivoEntrada, String archivoSalida, String pass) throws Exception {
        Key claveSecreta = new SecretKeySpec(pass.getBytes(), ALGORITMO);
        Cipher cifrador = Cipher.getInstance(TRANSFORMACION);
        cifrador.init(modoCifrado, claveSecreta);

        try (InputStream entrada = new FileInputStream(archivoEntrada);
             OutputStream salida = new FileOutputStream(archivoSalida)) {
            byte[] bytesEntrada = new byte[(int) new File(archivoEntrada).length()];
            entrada.read(bytesEntrada);
            byte[] bytesSalida = cifrador.doFinal(bytesEntrada);
            salida.write(bytesSalida);
        }

        Files.deleteIfExists(Paths.get(archivoEntrada));
    }
}
