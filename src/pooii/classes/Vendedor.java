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
public class Vendedor extends Empregado {
    
    private Double totalVendas;
    private Double comissao;

    @Override
    /**
     * comissao = valor entre 0 e 1, onde 0 significa 0% e 1 significa 100%
     */
    public Double calcularSalario() {
        return super.calcularSalario() + (getTotalVendas()*getComissao());
    }
    
    

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
    
    
    
    
    
}
