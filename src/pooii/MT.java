/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii;

/**
 *
 * @author Valmir
 */
public class MT implements Runnable{
    String ms="S ";
    
    @Override
    public void run() {
        this.ms="N ";
    }
    
    public static void main(String[] args) {
        MT t=new MT();
        new Thread(t).start();
        for (int i = 0; i < 10; i++) {
            System.out.print(t.ms);
        }
    }

    
    
}
