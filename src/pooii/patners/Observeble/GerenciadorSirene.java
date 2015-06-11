/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.patners.Observeble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valmir
 */
public class GerenciadorSirene {
    
    public static void main(String[] args) {
        SireneConcreta sireneConcreta=new SireneConcreta();
        OperarioConcreto obs1=new OperarioConcreto(sireneConcreta);
        OperarioConcreto obs2=new OperarioConcreto(sireneConcreta);
        sireneConcreta.alterarAlerta();
        try {
            Thread.sleep(5000);
            sireneConcreta.alterarAlerta();
            Thread.sleep(5000);
            sireneConcreta.alterarAlerta();
            Thread.sleep(5000);
            sireneConcreta.alterarAlerta();
        } catch (InterruptedException ex) {
            Logger.getLogger(GerenciadorSirene.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
