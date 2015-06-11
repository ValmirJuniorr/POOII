/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.concorrencia.corridaJegue;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUNOFAP
 */
public class Jegue implements Runnable{

    private String nome;
    private int distancia=0;
    private int numPassos=0;

    public int getDistancia() {
        return distancia;
    }

    public int getNumPassos() {
        return numPassos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void run() {
        while (distancia < 100) {
            try {
                Thread.sleep(1000);
                int movimento=new Random().nextInt(10)+1;    
                distancia+=movimento;
                System.out.println("O "+nome+" Se moveu:"+movimento+" E  Correu: No total "+distancia+" Metros");
                numPassos++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Jegue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("O "+nome+" Chegou ");
    }

    public boolean chegouMaisRapido(Jegue adversario){
        if(this.numPassos<adversario.numPassos){
            return true;
        }else if(this.numPassos>adversario.numPassos){
            return false;
        }if(this.distancia>adversario.distancia){
            return true;
        }else if(this.distancia>adversario.distancia){
            return false;
        }
        return false;
    }
}
