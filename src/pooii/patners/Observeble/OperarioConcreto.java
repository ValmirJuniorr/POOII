/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooii.patners.Observeble;

/**
 *
 * @author Valmir
 */
public class OperarioConcreto implements Operario{

    private final SireneConcreta objetoObservado;
    
    public OperarioConcreto(SireneConcreta o){
        this.objetoObservado=o;
        objetoObservado.adicionarObservador(this);
    }        
    
    public void atualizar(Sirene s) {
        if(s==objetoObservado){
            System.out.println("[INFO] A Sirene mudou seu estado para: "+objetoObservado.getAlerta());
        }
    }
    
}
