/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberosconclasebarberia;

/**
 *
 * @author Juanma
 */
public class Barbero implements Runnable{
    private Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    @Override
    public void run() {
        try {
            while (true) {
                barberia.corteDeCabello();  
                int tiempoDePelado = (int)(Math.random()*4+1)*1000;
                Thread.sleep(tiempoDePelado);
                System.out.println("El corte de pelo ha durado: "+tiempoDePelado/1000+" segundos");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
