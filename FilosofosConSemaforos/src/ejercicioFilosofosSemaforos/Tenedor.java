/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioFilosofosSemaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Juanma
 */
public class Tenedor {
    private Semaphore semaforo = new Semaphore(1);
    
    public void cogerTenedor() throws InterruptedException{
        semaforo.acquire();
    }
    
    public void soltarTenedor(){
        semaforo.release();
    }
}
