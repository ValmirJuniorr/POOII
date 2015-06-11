/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.patners.Observeble;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Valmir
 */
public class SireneConcreta implements Sirene{
    
    private boolean alertaSonaro=false;
    private ArrayList observadores=new ArrayList();
    
    public void alterarAlerta(){
        if(alertaSonaro)
            alertaSonaro=false;
        else
            alertaSonaro=true;
        notificaObservadores();
    }

    public boolean getAlerta() {
        return alertaSonaro;
    }

    public void adicionarObservador(Operario operario) {
        observadores.add(operario);
    }

    public void removeObservador(Operario operario) {
        observadores.remove(operario);
    }

    private void notificaObservadores() {
        Iterator i=observadores.iterator();
        while (i.hasNext()) {
            Operario o = (Operario)i.next();
            o.atualizar(this);
        }
    }
    
    
}
