/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.patners.singleton;

/**
 *
 * @author Valmir
 */
public class Main {

    public static void main(String[] args) {
        Config c1 = Config.getIstance();
        Config c2 = Config.getIstance();
        Config c3 = Config.getIstance();
        Config c4 = Config.getIstance();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

    }

}
