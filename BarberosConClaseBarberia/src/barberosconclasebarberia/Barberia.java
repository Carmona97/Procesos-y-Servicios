/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberosconclasebarberia;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Juanma
 */
public class Barberia {
    private static final int NUM_SILLAS = 5;

    private Semaphore sillasDisponibles = new Semaphore(NUM_SILLAS);
    private Semaphore sillaBarbero = new Semaphore(1);
    private Semaphore clienteListo = new Semaphore(0);

    private int clientesEnEspera = 0;

    public void llegaCliente() throws InterruptedException {
        if (clientesEnEspera < NUM_SILLAS) {
            sillasDisponibles.acquire();
            clientesEnEspera++;
            System.out.println("Cliente llega. Clientes en espera: " + clientesEnEspera);

            // Despierta al barbero si está durmiendo
            if (clientesEnEspera == 1) {
                clienteListo.release();
            }

            sillasDisponibles.release();
        } else {
            System.out.println("Cliente se va, no hay sillas disponibles.");
        }
    }
    
    public void corteDeCabello() throws InterruptedException {
        clienteListo.acquire();
        sillaBarbero.acquire();

        clientesEnEspera--;
        sillasDisponibles.release();

        System.out.println("Barbero corta el cabello. Clientes en espera: " + clientesEnEspera);

        sillaBarbero.release();
        clienteListo.release();
        
        if(clientesEnEspera == 0){
            System.out.println("Barbero yendose a dormir");
            Thread.sleep(5000);
            llegaCliente();
        }
    }
}
