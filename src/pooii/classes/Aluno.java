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
public class Aluno extends Pessoa implements EfetuaPagamento{

    
    private Integer matricula;
    private Double valorMensalidade;

    @Override
    public Double getValor() {
        return getValorMensalidade();
    }
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(Double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
    

    
    
    
}
