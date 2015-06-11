/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.concorrencia;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ALUNO
 */
public class Main {

    public static void main(String args[]) {
        Random valorGerado = new Random();
        int numLinhas, numColunas;
        numLinhas = valorGerado.nextInt(10) + 1;
        numColunas = valorGerado.nextInt(10) + 1;
        int matriz[][] = new int[numLinhas][numColunas];
        CalculaLinhaMatriz somaLinha;
        for (int i = 0; i < numLinhas; i++) {
            System.out.print("Impressao da matriz: ");
            for (int j = 0; j < numColunas; j++) {                
                matriz[i][j] = valorGerado.nextInt(10) + 1;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < numLinhas; i++) {
            somaLinha = new CalculaLinhaMatriz(matriz[i], "Thread : " + i);
            somaLinha.start();
        }
    }

    public int somaLinha(int[] linha) {
        int soma = 0;
        for (int j = 0; j < linha.length; j++) {
            soma = linha[j];
        }
        return soma;
    }
}
