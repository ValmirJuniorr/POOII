/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.patners.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import pooii.classes.Empregado;


/**
 *
 * @author ALUNOFAP
 */
public class ExecIterator {

    public static void main(String[] args) { 
        ArrayList<Empregado> empregados=new ArrayList<Empregado>();
        for (int i = 0; i < 10; i++) {
            empregados.add(new Empregado());
        }
        for (Iterator<Empregado> iterator = empregados.iterator(); iterator.hasNext();) {
            Empregado next = iterator.next();
            try {
                next.setSalario(987.00);
            } catch (Exception ex) {
                Logger.getLogger(ExecIterator.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        int i=0;
        for (Iterator<Empregado> iterator = empregados.iterator(); iterator.hasNext();) {
            i++;
            Empregado next = iterator.next();
            System.out.println("Empregado: "+i+" Valor: "+next.getSalario());
            
        }
        
    }
}
