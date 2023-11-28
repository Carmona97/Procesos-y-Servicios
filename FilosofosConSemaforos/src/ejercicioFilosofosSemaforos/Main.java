/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioFilosofosSemaforos;

/**
 *
 * @author Juanma
 */
public class Main {
 private static final int NUM_FILOSOFOS = 5;
    private static final Tenedor[] tenedores = new Tenedor[NUM_FILOSOFOS];

    public static void main(String[] args) {
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            tenedores[i] = new Tenedor();
        }

        Thread[] filosofos = new Thread[NUM_FILOSOFOS];
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            final int filosofoID = i;
            filosofos[i] = new Thread(() -> {
                while (true) {
                    try {
                        pensar(filosofoID);
                        tomarTenedores(filosofoID);
                        comer(filosofoID);
                        dejarTenedores(filosofoID);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            filosofos[i].start();
        }
    }

    private static void pensar(int filosofoID) throws InterruptedException {
        System.out.println("El filósofo " + filosofoID + " está pensando");
        Thread.sleep((int) (Math.random() * 4000) + 1000);
    }

    private static void tomarTenedores(int filosofoID) throws InterruptedException {
        int tenedorIzq = filosofoID;
        int tenedorDer = (filosofoID + 1) % NUM_FILOSOFOS;

        tenedores[tenedorIzq].cogerTenedor();
        System.out.println("El filósofo " + filosofoID + " ha tomado el tenedor izquierdo");
        tenedores[tenedorDer].cogerTenedor();
        System.out.println("El filósofo " + filosofoID + " ha tomado el tenedor derecho");
    }

    private static void comer(int filosofoID) throws InterruptedException {
        System.out.println("El filósofo " + filosofoID + " está comiendo");
        Thread.sleep((int) (Math.random() * 3000) + 1000);
    }

    private static void dejarTenedores(int filosofoID) {
        int tenedorIzq = filosofoID;
        int tenedorDer = (filosofoID + 1) % NUM_FILOSOFOS;

        tenedores[tenedorIzq].soltarTenedor();
        System.out.println("El filósofo " + filosofoID + " ha soltado el tenedor izquierdo");
        tenedores[tenedorDer].soltarTenedor();
        System.out.println("El filósofo " + filosofoID + " ha soltado el tenedor derecho");
    }
        
}
