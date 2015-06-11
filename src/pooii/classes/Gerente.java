package pooii.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taciano
 */
public class Gerente extends Empregado{
    
    private Double gratificacao;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + getGratificacao(); 
    }

}