/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carmonaruizpreexamenapi2;

import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class CarmonaRuizPreExamenAPI2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce un numero para el id");
        String id = scn.next();
        realizarConsulta(id);
    }
    //En el caso de la api seleccionada tiene que pasarse la ID como valorDelObjetoEnAPI
        public static void realizarConsulta(String valorDelObjetoEnAPI) {
        String correoEmisor = "xxx";
        String password = "jola ihhg tiql ccby";
        GestorCorreo gestionEmail = new GestorCorreo();
        GestorAPI peticion = new GestorAPI();
        ClaseObjetoAPI objetoSeleccionado = null;
        try {
            
            //El ejemplo esta hecho con la api de RICK y MORTY por tener url de imagen
            objetoSeleccionado = peticion.objetoSeleccionado("https://rickandmortyapi.com/api/", "character/", valorDelObjetoEnAPI);
            peticion.almacenarFoto(objetoSeleccionado.getImagen(), "foto.jpeg");
            gestionEmail.enviarMensajeConAdjunto(correoEmisor, "Direccion a enviar", "Asunto", objetoSeleccionado.toString(), correoEmisor, password, "foto.jpeg");
            System.out.println("Enviado con exito");
            

        } catch (Exception ex) {
            System.out.println("Ocurrió un error al realizar la consulta: " + ex.getMessage());
        }
    }
}
