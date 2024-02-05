/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carmonajuanmanuelservidorftp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author juanm
 */
public class GestorFTPCarmona {
    
    private String servidor;
    private int puerto;
    private String usuario;
    private String contrasena ;
    private FTPClient clienteFTP;
      

    public GestorFTPCarmona(String servidor, int puerto, String usuario, String contrasena) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.clienteFTP = new FTPClient();
    }

    public FTPClient getClienteFTP() {
        return clienteFTP;
    }

    public String getServidor() {
        return servidor;
    }

    public int getPuerto() {
        return puerto;
    }
    
    
    
    public boolean conectar() throws SocketException, IOException {
        boolean conexionExitosa = true;
        clienteFTP.connect(servidor,puerto);
        int respuesta = clienteFTP.getReplyCode();
        if (!FTPReply.isPositiveCompletion(respuesta)) {
            clienteFTP.disconnect();
            conexionExitosa = false;
        }
        
        boolean credencialesOK = clienteFTP.login(usuario,contrasena);
        
        if (!credencialesOK) {
            conexionExitosa = false;     
        }
        
        clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);
        return conexionExitosa;
    }
    
     public boolean descargarFichero(String nombreFichero) throws IOException {
        boolean descargaExitosa = false;
        String destinoFichero = ".\\src\\main\\java\\com\\mycompany\\carmonajuanmanuelservidorftp\\Archivos";
        String rutaFichero = destinoFichero + nombreFichero;

        try (OutputStream oS = new FileOutputStream(rutaFichero)) {
            descargaExitosa = clienteFTP.retrieveFile(nombreFichero, oS);
        }
        
        return descargaExitosa;
    }
     
        public void descargarFicheros() {
            try {
                clienteFTP.connect(servidor, puerto);
                clienteFTP.login(usuario,contrasena);
                clienteFTP.enterLocalPassiveMode();
                clienteFTP.setFileType(FTP.BINARY_FILE_TYPE);

                String[] archivos = clienteFTP.listNames();

                for (String archivo : archivos) {
                    if(descargarFichero(archivo)){
                        System.out.println("Se ha descargado el fichero "+archivo);
                    }
                }

                clienteFTP.logout();
                clienteFTP.disconnect();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
