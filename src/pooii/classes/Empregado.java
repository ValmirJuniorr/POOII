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
public class Empregado extends Pessoa implements RecebePagamento{

    private Double salario;
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) throws Exception {
        if(salario<788.00){
            throw new Exception("Salario inferior ao minimo nao eh permitido");
        }
        this.salario = salario;
    }
    
    public Double calcularSalario() {
        return getSalario();
    }

    @Override
    public Double getValor() {
        return calcularSalario();
    }
    
    
    
}
