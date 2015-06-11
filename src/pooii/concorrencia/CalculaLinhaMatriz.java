/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pooii.concorrencia;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author ALUNO
 */
public class CalculaLinhaMatriz extends Thread{
    String nomeThread;
    private int[] linha;
    private int soma=0;
    
    public CalculaLinhaMatriz(int[] linha,String nomeThread){
        this.linha=linha;
        this.nomeThread=nomeThread;
    }

    @Override
    public void run(){
        int dormir=new Random().nextInt(10000);
        try {
            System.out.println("A "+nomeThread+" durmiu: "+dormir);
            Thread.sleep(dormir);
        } catch (InterruptedException ex) {
            Logger.getLogger(CalculaLinhaMatriz.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("A "+nomeThread+" Acordou");
        for (int i = 0;i<linha.length;i++) {
            soma+=linha[i];
        }
        System.out.println("O valor da Soma na Thread: "+nomeThread+" e: "+soma);
    }
}
