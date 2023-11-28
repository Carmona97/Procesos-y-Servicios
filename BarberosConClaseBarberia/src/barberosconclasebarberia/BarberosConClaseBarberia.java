/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barberosconclasebarberia;

/**
 *
 * @author Juanma
 */
public class BarberosConClaseBarberia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barberia barberia = new Barberia();
        Thread barberThread = new Thread(new Barbero(barberia));
        barberThread.start();

        // Simulación de llegada de clientes
        while(true) {
            Thread clienteThread = new Thread(new Cliente(barberia));
            clienteThread.start();
            
            try {
                Thread.sleep(3000);  // Simula el tiempo entre llegadas de clientes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
