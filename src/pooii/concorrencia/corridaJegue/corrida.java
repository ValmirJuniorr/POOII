/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.concorrencia.corridaJegue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNOFAP
 */
public class corrida {

    public static void main(String args[]) {
        final int numjegues = 10;
        final Jegue[] jegues = new Jegue[numjegues];
        final Thread threadjegues[] = new Thread[numjegues];
        for (int i = 0; i < numjegues; i++) {
            jegues[i] = new Jegue();
            jegues[i].setNome("Jegue " + i);
            threadjegues[i] = new Thread(jegues[i]);
        }
        for (int i = 0; i < numjegues; i++) {
            threadjegues[i].start();
        }
        Thread compara = new Thread(new Runnable() {

            public void run() {
                boolean terminou = false;
                try {
                    while (!terminou) {
                        Thread.sleep(1000);
                        int i;
                        for (i = 0; i < numjegues; i++) {
                            if (threadjegues[i].isAlive()) {
                                break;
                            }
                        }
                        if (i == numjegues) {
                            terminou = true;
                        }
                    }
                    for (int j = 0; j < numjegues - 1; j++) {
                        for (int i = 0; i < numjegues - 1; i++) {
                            Jegue temp;
                            if (!jegues[i].chegouMaisRapido(jegues[i + 1])) {
                                temp = jegues[i];
                                jegues[i] = jegues[i + 1];
                                jegues[i + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < numjegues; i++) {
                        System.out.println("O " + jegues[i].getNome() + " Chegou: em :" + (i + 1)
                                + " E  Gastou: " + jegues[i].getNumPassos() + " Percorrendo " + jegues[i].getDistancia()
                                + " Metros");
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(corrida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        compara.start();

    }
}
