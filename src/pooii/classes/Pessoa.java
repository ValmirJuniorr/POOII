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
public class Pessoa {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        String nomeSemEspacaoIniFim=nome.trim();
        if(soTemLetrasValidas(nomeSemEspacaoIniFim)){
            if(nomeSemEspacaoIniFim.length()>40){
                throw new Exception("Numero de caracteres no nome excedeu o o tamanho maximo que é 100");
            }else if(nomeSemEspacaoIniFim.length()<1){
                    throw new Exception("Nome invalido nulo");                
            }
        }else{
            throw new Exception("Caracteres Invalidos");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public static boolean soTemLetrasValidas(String palavra){ 
        int sizePalavra=palavra.length();
        String caracteresAValidos="abcdfghijklmnopqrstuvwxyzàáâãéêíóôõú"
                + "ABCDFGHIJKLMNOPQRSTUVXWYZÀÁÃÉÊÍÓÚ";
        for (int i = 0; i < sizePalavra; i++) {
             String caractere = palavra.charAt(i)+"";             
                if(!caracteresAValidos.contains(caractere)) {
                    return false;
                }
        }
        return true;
    }

}
