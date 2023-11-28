/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberosconclasebarberia;

/**
 *
 * @author Juanma
 */
public class Cliente implements Runnable{
    private Barberia barberia;

    public Cliente(Barberia barberia) {
        this.barberia = barberia;
    }

    @Override
    public void run() {
        try {
            barberia.llegaCliente();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
