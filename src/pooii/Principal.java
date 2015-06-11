package pooii;


import pooii.classes.Aluno;
import pooii.classes.EfetuaPagamento;
import pooii.classes.Empregado;
import pooii.classes.Gerente;
import pooii.classes.RecebePagamento;
import pooii.classes.Vendedor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taciano
 */
public class Principal {
   
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno();
        a1.setCpf("11111");
        a1.setNome("Aluno 1");
        a1.setValorMensalidade(400.00);
        
        Aluno a2 = new Aluno();
        a2.setCpf("22222");
        a2.setNome("Aluno 2");
        a2.setValorMensalidade(500.00);
        
        Aluno a3 = new Aluno();
        a3.setCpf("333333");
        a3.setNome("Aluno 3");
        a3.setValorMensalidade(600.00);
        
        Empregado e1 = new Empregado();
        e1.setCpf("44444");
        e1.setNome("Empregado E4");
        e1.setSalario(200.00);

        Empregado e2 = new Empregado();
        e2.setCpf("55555");
        e2.setNome("Empregado E5");
        e2.setSalario(300.00);
        
        
        Gerente g1 = new Gerente();
        g1.setCpf("666666");
        g1.setNome("Gerente g6");
        g1.setGratificacao(500.00);
        g1.setSalario(500.00);
        
        Gerente g2 = new Gerente();
        g2.setCpf("7777777");
        g2.setNome("Gerente g7");
        g2.setGratificacao(1000.00);
        g2.setSalario(500.00);
        
        Vendedor v1 = new Vendedor();
        v1.setNome("Vendedor v8");
        v1.setCpf("8888888888");
        v1.setComissao(0.1);
        v1.setTotalVendas(60000.00);
        v1.setSalario(100.00);
     
        Vendedor v2 = new Vendedor();
        v2.setNome("Vendedor v9");
        v2.setCpf("99999999");
        v2.setComissao(0.2);
        v2.setTotalVendas(2000.00);
        v2.setSalario(1000.00);
        
        
        List<RecebePagamento> contasPagar = new ArrayList<RecebePagamento>();
        contasPagar.add(e1);
        contasPagar.add(e2);
        contasPagar.add(g1);
        contasPagar.add(g2);
        contasPagar.add(v1);
        contasPagar.add(v2);

        
        List<EfetuaPagamento> contasReceber = new ArrayList<EfetuaPagamento>();
        contasReceber.add(a1);
        contasReceber.add(a2);
        contasReceber.add(a3);
        
        
        Iterator<RecebePagamento> it = contasPagar.iterator();
        RecebePagamento rp;
        Double saldo = 0.0;
        while (it.hasNext()) {
            rp = it.next();
            saldo -= rp.getValor();
        }
        
                
        Iterator<EfetuaPagamento> it2 = contasReceber.iterator();
        EfetuaPagamento rp2;
        while (it2.hasNext()) {
            rp2 = it2.next();
            saldo += rp2.getValor();
        }
        
        System.out.println(saldo);
        
    }   
    
}
